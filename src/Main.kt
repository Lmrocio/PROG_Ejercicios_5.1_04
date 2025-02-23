fun main(){

    val notificaciones: List<Notificable> = listOf(
        CorreoElectronico(),
        MensajeTexto(),
        NotificacionPush()
    )

    for(noti in notificaciones){
        noti.enviarNotificacion()
    }
}