**Private Constructor**: The class's constructor is made private, ensuring that no other class can instantiate an object of this class directly.

_private Singleton() {}_

**Private Static Instance**: The class maintains a private static instance of itself.

_private static Singleton uniqueInstance;_

**Public Static Method**: There's a public static method (often named getInstance()) that provides access to the instance. When this method is called:

public static Singleton getInstance() {
if (instance == null) {
instance = new Singleton();
}
return instance;
}

If the instance does not already exist, it is created.
The existing instance is returned.
