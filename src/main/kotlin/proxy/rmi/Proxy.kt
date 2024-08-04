package proxy.rmi

import java.io.Serializable
import java.rmi.Remote
import java.rmi.RemoteException
import java.rmi.registry.LocateRegistry
import java.rmi.server.UnicastRemoteObject

class Person(val name: String, val age: Int): Serializable

interface HelloService : Remote {
    @Throws(RemoteException::class)
    fun hello(person: Person): String
}

class HelloServiceImpl : HelloService {
    override fun hello(person: Person) = "Hello, ${person.name}, you are ${person.age} years old.".also(::println)
}

inline fun <reified T: Remote> publish(port: Int, obj: T) {
    LocateRegistry.createRegistry(port).bind(T::class.simpleName, UnicastRemoteObject.exportObject(obj, 0))
}
inline fun <reified T: Remote> consume(host: String, port: Int): T {
    return LocateRegistry.getRegistry(host, port).lookup(T::class.simpleName) as T
}