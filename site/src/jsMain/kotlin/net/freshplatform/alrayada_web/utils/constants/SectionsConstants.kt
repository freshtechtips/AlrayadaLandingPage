package net.freshplatform.alrayada_web.utils.constants

import net.freshplatform.alrayada_web.core.router.Routes
import net.freshplatform.alrayada_web.js.encodeURIComponent

object SectionsConstants {
    object Location {
        const val MAP_API = "https://maps.google.com/maps?q=33.3118022,44.2733333&z=15&output=embed"
    }

    object Footer {
        const val REPOSITORY_URL = "https://github.com/FreshKernel/alrayada-web"
    }

    object Contact {
        const val FORM_URL = "https://formspree.io/f/xjvqwrjq"
        private const val WHATSAPP_URL = "https://wa.me/+9647901520604"

        fun whatsappUrlWithText(text: String) = "${WHATSAPP_URL}?text=${encodeURIComponent(text)}"
    }

    object MobileApp {
        private const val DYNAMIC_DOWNLOAD_LINK = Routes.DOWNLOAD_MOBILE_APP
        const val GOOGLE_PLAY = "https://play.google.com/store/apps/details?id=net.freshplatform.alrayada"
        const val APPLE_APP_STORE = DYNAMIC_DOWNLOAD_LINK
    }
}
