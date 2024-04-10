package com.aiglepub.composecomponents.ui.medialist.model

data class MediaItem(
    val id: Int,
    val title: String,
    val thumb: String,
    val type: Type
) {
    enum class Type { PHOTO, VIDEO }
}


fun generateListOfMediaItem(): List<MediaItem> {
    val list = (1..10).map {
        MediaItem(
            id = it,
            title = "Title $it",
            thumb = "https://upload.wikimedia.org/wikipedia/commons/f/f6/Eiffel_tower_at_dawn_horizontal.jpg",
            type = if (it % 2 == 0) MediaItem.Type.PHOTO else MediaItem.Type.VIDEO
        )
    }
    return list
}