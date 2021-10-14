# Design CartService

# Requirements
- User add products to cart.
- Cart needs to show the total with any tax and subtotal.. as per the merchant
- Cart needs to show if there is a coupon applied
- Cart needs to show if orders are for different countires
- Cart needs to show delivery channels alongwith order info
- Cart needs to update quantities of products
- Cart needs to delete addon products if main product is deleted
- Cart need to be supported for different merchants
- Requests needs to be validated 

## Translation into Objects
- Cart has a merchant id
- Cart has products data and qty
- Cart can have expiry date and status
- Cart is linked to user session if not logged in
- Cart is linked to user id if logged in
- Cart will have methods to allow updation/deletion of products
- Cart will have methods to show countrywise and delivery channelwise products
- Cart will validate products 
- Cart will ask Bill Service to get subtotal and Tax
- Middleware will validate the requests w.r.t session/tokens
- Midlleware extract the merchant id request by decrypting the token and pass on information to controller

## Expected Queries
- Cart will have queries on Product Models
- Biiling Service will query Product Models + Prodcut_Taxation Models + Coupon Models
- Middleware will query UserSession Models

## Class Diagram Walk Through
To be added


### ClassDiagram
To be added

### Code 
To be added

