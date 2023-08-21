package br.com.jones.library.core.features.breed.network.dto

import com.google.gson.annotations.SerializedName

data class BreedDTO(
    @SerializedName("country_codes") val id: String?,
    @SerializedName("country_codes") val name: String?,
    @SerializedName("country_codes") val weight: BreedWeightDTO?,
    @SerializedName("cfa_url") val cfaUrl: String?,
    @SerializedName("vetstreet_url") val vetStreetUrl: String?,
    @SerializedName("vcahospitals_url") val vcaHospitalsUrl: String?,
    @SerializedName("temperament") val temperament: String?,
    @SerializedName("origin") val origin: String?,
    @SerializedName("country_codes") val countryCodes: String?,
    @SerializedName("country_code") val countryCode: String?,
    @SerializedName("description") val description: String?,
    @SerializedName("life_span") val lifeSpan: String?,
    @SerializedName("indoor") val indoor: Int?,
    @SerializedName("lap") val lap: Int?,
    @SerializedName("alt_names") val altNames: String?,
    @SerializedName("dog_friendly") val dogFriendly: Int?,
    @SerializedName("energy_level") val energyLevel: Int?,
    @SerializedName("grooming") val grooming: Int?,
    @SerializedName("health_issues") val healthIssues: Int?,
    @SerializedName("intelligence") val intelligence: Int?,
    @SerializedName("shedding_level") val sheddingLevel: Int?,
    @SerializedName("social_needs") val socialNeeds: Int?,
    @SerializedName("stranges_friendly") val strangerFriendly: Int?,
    @SerializedName("vocalisation") val vocalisation: Int?,
    @SerializedName("experimental") val experimental: Int?,
    @SerializedName("hairless") val hairless: Int?,
    @SerializedName("natual") val natural: Int?,
    @SerializedName("rare") val rare: Int?,
    @SerializedName("rex") val rex: Int?,
    @SerializedName("suppressed_tail") val suppressedTail: Int?,
    @SerializedName("short_legs") val shortLegs: Int?,
    @SerializedName("wikipedia_url") val wikipediaUrl: String?,
    @SerializedName("hypoallergenic") val hypoallergenic: Int?,
    @SerializedName("reference_image_id") val referenceImageId: String?
)

