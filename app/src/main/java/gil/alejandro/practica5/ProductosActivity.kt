package gil.alejandro.practica5

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView

class ProductosActivity : AppCompatActivity() {
    var menu: ArrayList<Product> = ArrayList<Product>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_productos)

        var menuOption: String? = intent.getStringExtra("menuType")
        agregarProductos(menuOption)

        var listview: ListView = findViewById(R.id.listview) as ListView


        var adaptador: AdaptadorProductos = AdaptadorProductos(this, menu)
        listview.adapter = adaptador
    }
        fun agregarProductos(option:String?){
            when(option){
                "Antojitos"->{
                    menu.add(
                        Product("Quesadillas", R.drawable.quesadillas,
                            "Rellenas con su carne favorita, servidas con ensalada - Filled with your choice of meat, served with salad.\n"+
                                    "\n", 5.69)
                    )
                    menu.add(
                        Product("Huaraches", R.drawable.huaraches,
                            "Tortilla gruesa con frijoles, tu carne favorita, lechuga, queso fresco y crema - Big Thick tortilla with beans, your choice of meat, fresh cheese, and sour cream.\n" +
                                    "\n", 10.85)
                    )
                    menu.add(
                        Product("Gringas", R.drawable.gringas,
                            "Tortilla de harina con queso, carne al pastor y piña - Flour tortilla with cheese marinated pork and pineapple\n" +
                                    "\n", 7.99))
                    menu.add(
                        Product("Sinconizadas", R.drawable.sincronizadas,
                            "Tortilla de harina rellena con queso y jamon. Se sirve con lechuga, crema y guacamole - Sandwich of Two four tortillas filled with ham and cheese. Served with lettuce, sour cream, and guacamole.\n" +
                                    "\n", 7.69))
                    menu.add(
                        Product("Sopes", R.drawable.sopes,
                            "Tortilla gruesa cubierta de frijoles, tu carne favorita, lechuga, queso fresco y crema - Fried thick tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes.\n" +
                                    "\n", 3.56))
                    menu.add(
                        Product("Tostadas", R.drawable.tostadas,
                            "Tortilla frita con frijoles, tu carne favorita, lechuga, queso fresco, crema y jitomate - Fried tortilla with beans, your choice of meat, lettuce, fresh cheese, sour cream and tomatoes.\n" +
                                    "\n", 3.56))
                }
                "Especialidades"->{
                    menu.add(
                        Product("Mojarra Frita", R.drawable.mojarra,
                            "Tilapia frita servida con lechuga, cebolla, jitomate, aguacate y tortillas - Fried tilapia served with lettuce, onions, tomatoes, avocado and tortillas.\n"+
                                    "\n", 17.99)
                    )
                    menu.add(
                        Product("Ceviche", R.drawable.ceviche,
                            "Tilapia, camarones, Aguacate y pico de gallo servido con Chips / Tilapia, Shrimp, Avocado and pico de gallo, served with Chips.\n" +
                                    "\n", 6.99)
                    )
                    menu.add(
                        Product("Botana con camarones", R.drawable.botanacamarones,
                            "\n" +
                                    "\n", 24.99)
                    )
                    menu.add(
                        Product("Cubetazo", R.drawable.cubetazo,
                            "\n" +
                                    "\n", 24.99)
                    )
                }
                "Combinations"->{
                    menu.add(
                        Product("Traditional Taco Combo", R.drawable.combinationtaco,
                            "Tortilla de Maíz y tu carne favorita. Servido con arroz y frijoles - Corn taco, your choice of meat, served with rice and beans.\n"+
                                    "\n", 6.99)
                    )
                    menu.add(
                        Product("Mexican Burritos", R.drawable.burritos,
                            "Tu carne favorita en una tortilla grande de harina rellena con cebolla frita, pico de gallo, guacamole, sour cream, frijoles y acompañado de arroz -Your choice of meat on a big burrito made of flour tortilla with rice, beans, lettuce, grilled onions, pico de gallo, guacamole and sour cream.\n"+
                                    "\n", 12.99)
                    )
                    menu.add(
                        Product("Los Portales Burrito", R.drawable.burritosportales,
                            "Large flour tortilla filled with grilled cactus, steak, pastor (seasoned pork), grilled onions, rice and beans. Served with a side of lettuce salad, tomatoes, sour cream and guacamole.\n"+
                                    "\n", 13.59)
                    )
                    menu.add(
                        Product("Cinco", R.drawable.cinco,
                            "One hard sell taco with your choice of meat, lettuce and cheese. One burrito with your choice of meat, pico de gallo, sour cream, guacamole and beans. Served with rice and beans.\n"+
                                    "\n", 9.99)
                    )
                    menu.add(
                        Product("Dos Amigos", R.drawable.dosamigos,
                            "Two hard shell tacos with your choice of meat topped with lettuce and shredded cheese. served with a side of rice and beans.\n"+
                                    "\n", 9.99)
                    )
                    menu.add(
                        Product("Burrito Pepe", R.drawable.burritopepe,
                            "Flour tortilla filled with your choice of meat with beans, lettuce, sour cream, guacamole and pico de gallo. served with a side of rice.\n"+
                                    "\n", 9.99)
                    )
                    menu.add(
                        Product("Fajita Burrito", R.drawable.burritos,
                            "Gran burrito relleno de tu carne favorita, cebolla, chile, arroz, frijoles y jitomate. Servido con lechuga y guacamole - Large burrito filled with your choice of meat, onions, chile, peppers, rice, beans and tomatoes. Served with lettuce guacamole and sour cream.\n"+
                                    "\n", 13.59)
                    )
                    menu.add(
                        Product("Fajita Quesasilla", R.drawable.fajitaquesadilla,
                            "Quesadilla extra grande (10 inches), rellena con tu carne favorita, cebolla asada, chile banana y jitomate. Servida con arroz, frijoles y ensalada - 10 inches quesadilla filled with your choice of meat, cooked with grilled onions, banana peppers and tomatoes. Served with rice beans and salad.\n"+
                                    "\n", 13.99)
                    )
                }
                "Tortas"->{
                    menu.add(
                        Product("Torta Regular", R.drawable.torta,
                            "All tortas come with lettuce, onions, tomatoes, avocado, sour cream, jalapeno pepper and your choice of meat.\n"+
                                    "\n", 12.99)
                    )
                    menu.add(
                        Product("Torta -Milanesa de Res o Pollo", R.drawable.tortamilanesa,
                            "Breaded Steak or Chicken.\n"+
                                    "\n", 13.99)
                    )
                }
            }

        }
}
private class AdaptadorProductos: BaseAdapter {
    var producto=ArrayList<Product>()
    var contexto: Context? = null
    constructor(contexto: Context, producto: ArrayList<Product>){
        this.producto = producto
        this.contexto = contexto
    }

    override fun getCount(): Int {
        return producto.size
    }

    override fun getItem(position: Int): Any {
        return producto[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var prod=producto[position]
        var inflador= LayoutInflater.from(contexto)
        var vista=inflador.inflate(R.layout.producto_view, null)

        var imagen=vista.findViewById(R.id.producto_img) as ImageView
        var nombre=vista.findViewById(R.id.producto_nombre) as TextView
        var desc=vista.findViewById(R.id.producto_desc) as TextView
        var precio=vista.findViewById(R.id.producto_precio) as TextView

        imagen.setImageResource(prod.image)
        nombre.setText(prod.name)
        desc.setText(prod.description)
        precio.setText("$${prod.price}")
        return vista

    }
}