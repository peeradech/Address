# Address
This Address module you to Province, District, Sub District and Postcode.

## Description
If you need an address based on Thailand You can download this module to use. There are 4 Entities in this module, which are province, district, sub-district and postal code.

Within this module, there is a function to easily prepare information for provinces, districts, sub-districts and postal codes. By pressing the **Initiate data** button, the data is extracted from an excel file located in the folder */resource/address/data/address.xls*. If you want to change the information, you can do so by editing the address.xls.

## Dependencies
**Mendix modules**
- MXModelReflection module
- Excel Importer

## Configuration
After importing the module into your application

**Constants**
- FileDataLocation is file of location for import data 

You can store data *(Province/District/Sub District/Postcode)* with **SNP_Initiate_Button** in your application with 2 step
1. Initiate excel template
2. Initiate data


