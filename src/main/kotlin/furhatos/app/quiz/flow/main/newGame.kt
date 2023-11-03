package furhatos.app.quiz.flow.main

import furhatos.app.quiz.flow.Parent
import furhatos.app.quiz.questions.QuestionSet
import furhatos.app.quiz.setting.playing
import furhatos.app.quiz.setting.quiz
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.flow.kotlin.users
import furhatos.nlu.common.Yes

val NewGame = state(parent = Parent) {
    onEntry {
        playing = true
        rounds = 0

        furhat.say("I will explain you some interesting concept and then I will ask you $maxRounds multiple choice questions. ")
        furhat.ask("Are you ready?")

    }
    onResponse<Yes> {
        furhat.say("Alright, here we go!")
        QuestionSet.next()
        furhat.attend(users.playing().first())
        goto(Lecture)
    }
}