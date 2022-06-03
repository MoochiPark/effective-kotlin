package item08

import kotlin.properties.Delegates

class Bundle

abstract class Activity {
    open fun onCreate(savedInstanceState: Bundle?) {
    }
}

class DoctorActivity : Activity() {
    private var doctorId: Int by Delegates.notNull()
    private var fromNotification: Boolean by Delegates.notNull()

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        doctorId = intent.extras.getInt(DOCTOR_ID_ARG)
//        fromNotification = intent.extras.getBoolean(FROM_NOTIFICATION_ARG)
//    }

}
