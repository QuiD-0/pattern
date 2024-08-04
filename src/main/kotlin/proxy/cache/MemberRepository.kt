package proxy.cache

interface MemberRepository {
    fun findById(id: Long): Member?

    fun save(member: Member)

    class MemberRepositoryImpl: MemberRepository {
        private val dbRepository = DbRepository()
        private val cacheRepository = CacheRepository()

        override fun findById(id: Long): Member? {
            return cacheRepository.findById(id) ?:
            dbRepository.findById(id)?.also(cacheRepository::save)
        }

        override fun save(member: Member) {
            dbRepository.save(member)
            cacheRepository.save(member)
        }
    }
}