package furhatos.app.quiz.questions

/**
 * The questions are structured like
 *  -The question
 *  -The correct answer, followed by alternative pronounciations
 *  -A list of other answers followed by their alternatives
 */
val questionsEnglish = mutableListOf(
        Question("What is 5 in the power of 2?",
                answer = listOf("25"),
                alternatives = listOf(listOf("15"), listOf("16"), listOf("20"))),

        Question("What is 3 in the power of 3?",
                answer = listOf("27"),
                alternatives = listOf(listOf("9"), listOf("6"), listOf("18"))),

        Question("What is 2 in the power of 2?",
                answer = listOf("4"),
                alternatives = listOf(listOf("6"), listOf("8"), listOf("10"))),

        Question("What is 4 in the power of 3?",
                answer = listOf("64"),
                alternatives = listOf(listOf("32"), listOf("12"), listOf("18"))),

        Question("What is 6 in the power of 2?",
                answer = listOf("36"),
                alternatives = listOf(listOf("6"), listOf("12"), listOf("21"))),
)