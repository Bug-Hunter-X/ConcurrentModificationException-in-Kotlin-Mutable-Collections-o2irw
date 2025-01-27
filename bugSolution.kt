fun main() {
    val list = mutableListOf(1, 2, 3, 4, 5)
    //Solution 1: Using removeIf for efficient removal
    list.removeIf { it % 2 == 0 }
    println(list) // Output: [1, 3, 5]

    val map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    map.removeIf { it.value % 2 == 0 }
    println(map) // Output: {a=1, c=3}

    //Solution 2: Using an iterator and remove() method for safe iteration and removal
    val list2 = mutableListOf(1, 2, 3, 4, 5)
    val iterator = list2.iterator()
    while (iterator.hasNext()) {
        val item = iterator.next()
        if (item % 2 == 0) {
            iterator.remove()
        }
    }
    println(list2) // Output: [1, 3, 5]

    //Solution 3: Create a new list
    val list3 = mutableListOf(1, 2, 3, 4, 5)
    val newList = list3.filter { it % 2 != 0 }.toMutableList()
    println(newList) // Output: [1, 3, 5]
}