package proxy.cache

class MemberService {
    private val memberRepository = MemberRepository.MemberRepositoryImpl()

    fun run() {
        val member1 = Member(1, "Alice", 20)
        val member2 = Member(2, "Bob", 25)

        memberRepository.save(member1)

        println(memberRepository.findById(1))
        println(memberRepository.findById(2))
    }
}

fun main() {
    MemberService().run()
}