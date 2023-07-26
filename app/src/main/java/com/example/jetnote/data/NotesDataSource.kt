package com.example.jetnote.data

import com.example.jetnote.model.Note

class NotesDataSource {
    fun loadNotes(): List<Note> {
        return listOf(
            Note(title="Summer Adventure", description="Explore the great outdoors and make memories with friends and family."),
            Note(title="Delicious Desserts", description="Indulge in a variety of mouthwatering desserts from around the world."),
            Note(title="Mindful Meditation", description="Find peace and tranquility through daily meditation practices."),
            Note(title="Artistic Inspiration", description="Unleash your creativity and express yourself through art."),
            Note(title="Fitness Challenge", description="Embark on a 30-day fitness journey to improve your health and well-being."),
            Note(title="Travel Bucket List", description="Discover dream destinations and plan your ultimate travel itinerary."),
            Note(title="Bookworm's Haven", description="Dive into captivating stories and expand your literary horizons."),
            Note(title="Gourmet Cooking Class", description="Learn to cook like a chef and impress your loved ones with gourmet dishes."),
            Note(title="Language Learning Adventure", description="Master a new language and unlock doors to exciting cultures."),
            Note(title="Gardening Guide", description="Create a thriving garden oasis and embrace the joys of gardening."),
        )
    }
}