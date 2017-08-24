fun hello(name: String = "World"): String {
   return "Hello, ${toGreet(name)}!"
}

private fun toGreet(name: String): String {
   return if(name.isBlank()) "World" else name;
}
