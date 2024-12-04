package com.enaitzdam.appmvvmzero

class AlumneProvider {
    companion object {
        fun alumnes(): List<AlumneModel> {
            return alumnes
        }

        private val alumnes = listOf(
            AlumneModel(
                nom = "Marcos",
                edat = 19
            ),
            AlumneModel(
                nom = "Pere",
                edat = 40
            ),
            AlumneModel(
                nom = "Pau Pulido",
                edat = 19
            ),
            AlumneModel(
                nom = "Mario",
                edat = 19
            ),
            AlumneModel(
                nom = "Alex",
                edat = 21
            ),
            AlumneModel(
                nom = "Roberto",
                edat = 21
            ),
            AlumneModel(
                nom = "Albert",
                edat = 34
            ),
            AlumneModel(
                nom = "Lorenzo",
                edat = 20
            ),
            AlumneModel(
                nom = "Marc",
                edat = 20
            ),
            AlumneModel(
                nom = "Miriam",
                edat = 20
            ),
            AlumneModel(
                nom = "Pau",
                edat = 18
            ),
            AlumneModel(
                nom = "Sergi",
                edat = 19
            ),
            AlumneModel(
                nom = "Marti",
                edat = 19
            )

        )
    }
}

