
import com.google.gson.annotations.SerializedName

 data class FoodsModel(
    @SerializedName("banners")
    val banners: List<Banner>?,
    @SerializedName("currency")
    val currency: String?,
    @SerializedName("shops")
    val shops: List<ShopX>?
) {

     data class Banner(
         @SerializedName("position")
         val position: Int?,
         @SerializedName("product")
         val product: Product?,
         @SerializedName("product_id")
         val productId: Int?,
         @SerializedName("shop")
         val shop: Shop?,
         @SerializedName("shopopenstatus")
         val shopopenstatus: String?,
         @SerializedName("shopstatus")
         val shopstatus: String?,
         @SerializedName("status")
         val status: String?,
         @SerializedName("url")
         val url: String?
     ) {
         override fun toString(): String {
             return "Banner(position=$position, product=$product, productId=$productId, shop=$shop, shopopenstatus=$shopopenstatus, shopstatus=$shopstatus, status=$status, url=$url)"
         }
     }

     data class ShopX(
         @SerializedName("address")
         val address: String?,
         @SerializedName("avatar")
         val avatar: String?,
         @SerializedName("categories")
         val categories: List<Category>?,
         @SerializedName("created_at")
         val createdAt: Any?,
         @SerializedName("cuisines")
         val cuisines: List<Cuisine>?,
         @SerializedName("default_banner")
         val defaultBanner: String?,
         @SerializedName("deleted_at")
         val deletedAt: Any?,
         @SerializedName("description")
         val description: String?,
         @SerializedName("device_id")
         val deviceId: String?,
         @SerializedName("device_token")
         val deviceToken: String?,
         @SerializedName("device_type")
         val deviceType: String?,
         @SerializedName("email")
         val email: String?,
         @SerializedName("estimated_delivery_time")
         val estimatedDeliveryTime: Int?,
         @SerializedName("favorite")
         val favorite: Any?,
         @SerializedName("id")
         val id: Int?,
         @SerializedName("latitude")
         val latitude: Double?,
         @SerializedName("longitude")
         val longitude: Double?,
         @SerializedName("maps_address")
         val mapsAddress: String?,
         @SerializedName("name")
         val name: String?,
         @SerializedName("offer_min_amount")
         val offerMinAmount: Int?,
         @SerializedName("offer_percent")
         val offerPercent: Int?,
         @SerializedName("otp")
         val otp: Any?,
         @SerializedName("phone")
         val phone: String?,
         @SerializedName("popular")
         val popular: Int?,
         @SerializedName("pure_veg")
         val pureVeg: Int?,
         @SerializedName("rating")
         val rating: Int?,
         @SerializedName("rating_status")
         val ratingStatus: Int?,
         @SerializedName("ratings")
         val ratings: Ratings?,
         @SerializedName("shopopenstatus")
         val shopopenstatus: String?,
         @SerializedName("shopstatus")
         val shopstatus: String?,
         @SerializedName("status")
         val status: String?,
         @SerializedName("timings")
         val timings: List<TimingX>?,
         @SerializedName("updated_at")
         val updatedAt: String?
     ) {
         override fun toString(): String {
             return "ShopX(address=$address, avatar=$avatar, categories=$categories, createdAt=$createdAt, cuisines=$cuisines, defaultBanner=$defaultBanner, deletedAt=$deletedAt, description=$description, deviceId=$deviceId, deviceToken=$deviceToken, deviceType=$deviceType, email=$email, estimatedDeliveryTime=$estimatedDeliveryTime, favorite=$favorite, id=$id, latitude=$latitude, longitude=$longitude, mapsAddress=$mapsAddress, name=$name, offerMinAmount=$offerMinAmount, offerPercent=$offerPercent, otp=$otp, phone=$phone, popular=$popular, pureVeg=$pureVeg, rating=$rating, ratingStatus=$ratingStatus, ratings=$ratings, shopopenstatus=$shopopenstatus, shopstatus=$shopstatus, status=$status, timings=$timings, updatedAt=$updatedAt)"
         }
     }

     data class Product(
         @SerializedName("addon_status")
         val addonStatus: Int?,
         @SerializedName("avalability")
         val avalability: Int?,
         @SerializedName("cuisine_id")
         val cuisineId: Any?,
         @SerializedName("description")
         val description: String?,
         @SerializedName("featured")
         val featured: Int?,
         @SerializedName("featured_position")
         val featuredPosition: Int?,
         @SerializedName("food_type")
         val foodType: String?,
         @SerializedName("id")
         val id: Int?,
         @SerializedName("max_quantity")
         val maxQuantity: Int?,
         @SerializedName("name")
         val name: String?,
         @SerializedName("out_of_stock")
         val outOfStock: String?,
         @SerializedName("position")
         val position: Any?,
         @SerializedName("shop_id")
         val shopId: Int?,
         @SerializedName("status")
         val status: String?
     ) {
         override fun toString(): String {
             return "Product(addonStatus=$addonStatus, avalability=$avalability, cuisineId=$cuisineId, description=$description, featured=$featured, featuredPosition=$featuredPosition, foodType=$foodType, id=$id, maxQuantity=$maxQuantity, name=$name, outOfStock=$outOfStock, position=$position, shopId=$shopId, status=$status)"
         }
     }

     data class Shop(
         @SerializedName("address")
         val address: String?,
         @SerializedName("avatar")
         val avatar: String?,
         @SerializedName("created_at")
         val createdAt: Any?,
         @SerializedName("default_banner")
         val defaultBanner: String?,
         @SerializedName("deleted_at")
         val deletedAt: Any?,
         @SerializedName("description")
         val description: String?,
         @SerializedName("device_id")
         val deviceId: String?,
         @SerializedName("device_token")
         val deviceToken: String?,
         @SerializedName("device_type")
         val deviceType: String?,
         @SerializedName("email")
         val email: String?,
         @SerializedName("estimated_delivery_time")
         val estimatedDeliveryTime: Int?,
         @SerializedName("id")
         val id: Int?,
         @SerializedName("latitude")
         val latitude: Double?,
         @SerializedName("longitude")
         val longitude: Double?,
         @SerializedName("maps_address")
         val mapsAddress: String?,
         @SerializedName("name")
         val name: String?,
         @SerializedName("offer_min_amount")
         val offerMinAmount: Int?,
         @SerializedName("offer_percent")
         val offerPercent: Int?,
         @SerializedName("otp")
         val otp: Any?,
         @SerializedName("phone")
         val phone: String?,
         @SerializedName("popular")
         val popular: Int?,
         @SerializedName("pure_veg")
         val pureVeg: Int?,
         @SerializedName("rating")
         val rating: Int?,
         @SerializedName("rating_status")
         val ratingStatus: Int?,
         @SerializedName("status")
         val status: String?,
         @SerializedName("timings")
         val timings: List<Timing>?,
         @SerializedName("updated_at")
         val updatedAt: String?
     ) {
         override fun toString(): String {
             return "Shop(address=$address, avatar=$avatar, createdAt=$createdAt, defaultBanner=$defaultBanner, deletedAt=$deletedAt, description=$description, deviceId=$deviceId, deviceToken=$deviceToken, deviceType=$deviceType, email=$email, estimatedDeliveryTime=$estimatedDeliveryTime, id=$id, latitude=$latitude, longitude=$longitude, mapsAddress=$mapsAddress, name=$name, offerMinAmount=$offerMinAmount, offerPercent=$offerPercent, otp=$otp, phone=$phone, popular=$popular, pureVeg=$pureVeg, rating=$rating, ratingStatus=$ratingStatus, status=$status, timings=$timings, updatedAt=$updatedAt)"
         }
     }

     data class Timing(
         @SerializedName("day")
         val day: String?,
         @SerializedName("end_time")
         val endTime: String?,
         @SerializedName("id")
         val id: Int?,
         @SerializedName("shop_id")
         val shopId: Int?,
         @SerializedName("start_time")
         val startTime: String?
     ) {
         override fun toString(): String {
             return "Timing(day=$day, endTime=$endTime, id=$id, shopId=$shopId, startTime=$startTime)"
         }
     }

     data class Category(
         @SerializedName("description")
         val description: String?,
         @SerializedName("id")
         val id: Int?,
         @SerializedName("name")
         val name: String?,
         @SerializedName("parent_id")
         val parentId: Int?,
         @SerializedName("position")
         val position: Any?,
         @SerializedName("products")
         val products: List<ProductX>?,
         @SerializedName("shop_id")
         val shopId: Int?,
         @SerializedName("status")
         val status: String?
     ) {
         override fun toString(): String {
             return "Category(description=$description, id=$id, name=$name, parentId=$parentId, position=$position, products=$products, shopId=$shopId, status=$status)"
         }
     }

     data class Cuisine(
         @SerializedName("id")
         val id: Int?,
         @SerializedName("name")
         val name: String?,
         @SerializedName("pivot")
         val pivot: Pivot?
     ) {
         override fun toString(): String {
             return "Cuisine(id=$id, name=$name, pivot=$pivot)"
         }
     }

     data class Ratings(
         @SerializedName("rating")
         val rating: String?,
         @SerializedName("shop_id")
         val shopId: Int?
     ) {
         override fun toString(): String {
             return "Ratings(rating=$rating, shopId=$shopId)"
         }
     }

     data class TimingX(
         @SerializedName("day")
         val day: String?,
         @SerializedName("end_time")
         val endTime: String?,
         @SerializedName("id")
         val id: Int?,
         @SerializedName("shop_id")
         val shopId: Int?,
         @SerializedName("start_time")
         val startTime: String?
     ) {
         override fun toString(): String {
             return "TimingX(day=$day, endTime=$endTime, id=$id, shopId=$shopId, startTime=$startTime)"
         }
     }

     data class ProductX(
         @SerializedName("addon_status")
         val addonStatus: Int?,
         @SerializedName("addons")
         val addons: List<Addon>?,
         @SerializedName("avalability")
         val avalability: Int?,
         @SerializedName("cuisine_id")
         val cuisineId: Any?,
         @SerializedName("description")
         val description: String?,
         @SerializedName("featured")
         val featured: Int?,
         @SerializedName("featured_position")
         val featuredPosition: Int?,
         @SerializedName("food_type")
         val foodType: String?,
         @SerializedName("id")
         val id: Int?,
         @SerializedName("images")
         val images: List<Image>?,
         @SerializedName("max_quantity")
         val maxQuantity: Int?,
         @SerializedName("name")
         val name: String?,
         @SerializedName("out_of_stock")
         val outOfStock: String?,
         @SerializedName("position")
         val position: Int?,
         @SerializedName("prices")
         val prices: Prices?,
         @SerializedName("shop_id")
         val shopId: Int?,
         @SerializedName("status")
         val status: String?
     ) {
         override fun toString(): String {
             return "ProductX(addonStatus=$addonStatus, addons=$addons, avalability=$avalability, cuisineId=$cuisineId, description=$description, featured=$featured, featuredPosition=$featuredPosition, foodType=$foodType, id=$id, images=$images, maxQuantity=$maxQuantity, name=$name, outOfStock=$outOfStock, position=$position, prices=$prices, shopId=$shopId, status=$status)"
         }
     }

     data class Addon(
         @SerializedName("addon")
         val addon: AddonX?,
         @SerializedName("addon_id")
         val addonId: Int?,
         @SerializedName("id")
         val id: Int?,
         @SerializedName("price")
         val price: Int?,
         @SerializedName("product_id")
         val productId: Int?
     ) {
         override fun toString(): String {
             return "Addon(addon=$addon, addonId=$addonId, id=$id, price=$price, productId=$productId)"
         }
     }

     data class Image(
         @SerializedName("position")
         val position: Int?,
         @SerializedName("url")
         val url: String?
     ) {
         override fun toString(): String {
             return "Image(position=$position, url=$url)"
         }
     }

     data class Prices(
         @SerializedName("currency")
         val currency: String?,
         @SerializedName("discount")
         val discount: Int?,
         @SerializedName("discount_type")
         val discountType: String?,
         @SerializedName("id")
         val id: Int?,
         @SerializedName("orignal_price")
         val orignalPrice: Double?,
         @SerializedName("price")
         val price: Double?
     )

     data class AddonX(
         @SerializedName("deleted_at")
         val deletedAt: Any?,
         @SerializedName("id")
         val id: Int?,
         @SerializedName("name")
         val name: String?,
         @SerializedName("shop_id")
         val shopId: Int?
     )

     data class Pivot(
         @SerializedName("cuisine_id")
         val cuisineId: Int?,
         @SerializedName("shop_id")
         val shopId: Int?
     )
 }