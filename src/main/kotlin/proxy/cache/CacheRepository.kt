package proxy.cache

class CacheRepository {
    private val cache = mutableMapOf<Long, Member>()

    fun findById(id: Long): Member? {
        return cache[id]?.also { println("Cache HIT") }
    }

    fun save(member: Member) {
        println("CacheRepository.save($member)")
        cache[member.id] = member
    }
}