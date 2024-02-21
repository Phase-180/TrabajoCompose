package com.curso.proyectocompose

object ContactsRepository {
    // Simulamos una lista de contactos estática para este ejemplo
    private val contacts = listOf(
        Contact(1, "John Doe", "+1234567890", "https://images.dog.ceo/breeds/terrier-yorkshire/n02094433_515.jpg"),
        Contact(2, "Jane Smith", "+0987654321", "https://images.dog.ceo/breeds/poodle-toy/n02113624_1785.jpg"),
        Contact(3, "Alice Johnson", "+9876543210", "https://images.dog.ceo/breeds/papillon/n02086910_2671.jpg"),
        Contact(4, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/pomeranian/n02112018_8246.jpg"),
        Contact(5, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/terrier-scottish/n02097298_8858.jpg"),
        Contact(6, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/greyhound-italian/n02091032_11119.jpg"),
        Contact(7, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/terrier-yorkshire/n02094433_515.jpg"),
        Contact(8, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/ovcharka-caucasian/IMG_20190611_152047.jpg"),
        Contact(9, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/mastiff-tibetan/n02108551_1664.jpg"),
        Contact(10, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/terrier-yorkshire/n02094433_515.jpg"),
        Contact(11, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/spaniel-sussex/n02102480_5792.jpg"),
        Contact(12, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/bulldog-english/jager-1.jpg"),
        Contact(13, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/pointer-germanlonghair/hans4.jpg"),
        Contact(14, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/samoyed/n02111889_6781.jpg"),
        Contact(15, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/redbone/n02090379_4324.jpg"),
        Contact(16, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/clumber/n02101556_3122.jpg"),
        Contact(17, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/poodle-standard/n02113799_639.jpg"),
        Contact(18, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/terrier-border/n02093754_5170.jpg"),
        Contact(19, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/shiba/mamehiko02.jpg"),
        Contact(20, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/akita/Akita_inu_blanc.jpg"),
        Contact(21, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/ridgeback-rhodesian/n02087394_7056.jpg"),
        Contact(22, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/terrier-welsh/lucy.jpg"),
        Contact(23, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/terrier-australian/n02096294_6785.jpg"),
        Contact(24, "Bob Brown", "+1122334455", "https://images.dog.ceo/breeds/hound-english/n02089973_4010.jpg"),
    )
    fun getContacts(): List<Contact> {
        return contacts
    }
}