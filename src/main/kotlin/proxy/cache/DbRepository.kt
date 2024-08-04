package proxy.cache

class DbRepository {
    private val map : MutableMap<Long, Member> = mutableMapOf()

    fun findById(id: Long): Member? {
        return map[id]?.also { println("DB HIT") }
    }

    fun save(member: Member) {
        println("DbRepository.save($member)")
        map[member.id] = member
    }
}