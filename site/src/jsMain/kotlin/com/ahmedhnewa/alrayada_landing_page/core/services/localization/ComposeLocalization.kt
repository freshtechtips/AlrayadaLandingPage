package com.ahmedhnewa.alrayada_landing_page.core.services.localization

import androidx.compose.runtime.Composable
import com.ahmedhnewa.alrayada_landing_page.core.data.StringRes
import com.ahmedhnewa.alrayada_landing_page.core.services.localization.Local.*
import kotlinx.browser.document
import kotlinx.browser.window
import org.w3c.dom.HTMLElement

private val defaultLocal: Local by lazy {
    val language = window.navigator.language

    val local = when {
        language.startsWith("en") -> English
        language.startsWith("ar") -> Arabic
        else -> English
    }
    val htmlElement = document.documentElement as HTMLElement
//    htmlElement.dir = local.dir.dirStr
    htmlElement.lang = language

    local
}

@Composable
fun stringResource(stringRes: StringRes): String {
    return LocalizationService
        .getInstance()
        .getLocalizedString(stringRes, defaultLocal)
}