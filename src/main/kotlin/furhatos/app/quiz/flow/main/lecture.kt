package furhatos.app.quiz.flow.main

import furhatos.app.quiz.RequestRepeatQuestion
import furhatos.app.quiz.flow.Parent
import furhatos.flow.kotlin.State
import furhatos.flow.kotlin.furhat
import furhatos.flow.kotlin.onResponse
import furhatos.flow.kotlin.state
import furhatos.gestures.Gestures
import furhatos.nlu.common.No
import furhatos.nlu.common.Yes

val Lecture: State = state(parent = Parent){
    onEntry {
        furhat.say("Exponent is defined as the method of expressing large numbers\n" +
                " in terms of powers. That means, exponent refers to how many times\n" +
                " a number multiplied by itself. For example, \n " +
                "6 is multiplied by itself 4 times, that is 6 × 6 × 6 × 6. \n" +
                "We can also say 6 in the power of 4.")
        furhat.ask("Did you get it?")
    }

    onReentry {
        furhat.say("Exponent is defined as the method of expressing large numbers\n" +
                " in terms of powers. That means, exponent refers to how many times\n" +
                " a number multiplied by itself. For example, \n " +
                "6 is multiplied by itself 4 times, that is 6 × 6 × 6 × 6. \n" +
                "We can also say 6 in the power of 4.")
        furhat.ask("Did you get it, now?")
    }

    onResponse<Yes> {
        furhat.say("That's good! Then let me ask you questions to see how you understood the concept")
        goto(AskQuestion)

    }

    onResponse<No> {
        furhat.say("Then. I will repeat.")
        reentry()
    }
    onResponse<RequestRepeatQuestion> {
        furhat.gesture(Gestures.BrowRaise)
        furhat.say("Alright. I will repeat.")
        reentry()
    }
}