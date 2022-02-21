Êþº¾   7 U  ejercicio/Visitante  java/lang/Object  ejercicio/IEntrada Nombre Ljava/lang/String; idVisitante I precioBaseEntrada D edad visitantesRegistrados <init> (Ljava/lang/String;DI)V Code
     ()V	    
	    	   	 
	    	   
 
 LineNumberTable LocalVariableTable this Lejercicio/Visitante; nombre 	getNombre ()Ljava/lang/String; 	setNombre (Ljava/lang/String;)V getIdVisitante ()I setIdVisitante (I)V getPrecioBaseEntrada ()D setPrecioBaseEntrada (D)V getEdad setEdad toString 4 java/lang/StringBuilder 6 Visitante [Nombre=
 3 8  '
 3 : ; < append -(Ljava/lang/String;)Ljava/lang/StringBuilder; > , idVisitante=
 3 @ ; A (I)Ljava/lang/StringBuilder; C , precioBaseEntrada=
 3 E ; F (D)Ljava/lang/StringBuilder; H , edad= J ]
 3 L 2 % calcularPrecioEntrada 	mayorEdad edadJubilacion DOS 
precioEntrada 
StackMapTable 
SourceFile Visitante.java !            	 
         
 
     
           „     $*· ² `³ *+µ *² µ *(µ *µ ±             
         #      *    $ ! "     $ #     $      $ 
 
   $ %     /     *´ °                     ! "    & '     >     *+µ ±       
                ! "      #    ( )     /     *´ ¬                     ! "    * +     >     *µ ±       
    "  #          ! "      	 
   , -     /     *´ ¯           &          ! "    . /     >     *'µ ±       
    *  +          ! "          0 )     /     *´ ¬           .          ! "    1 +     >     *µ ±       
    2  3          ! "      
 
   2 %     o     =» 3Y5· 7*´ ¶ 9=¶ 9*´ ¶ ?B¶ 9*´ ¶ DG¶ 9*´ ¶ ?I¶ 9¶ K°           7 ! 8 9 7         = ! "    M -     û     T<A=>9*´ ¢ 	9§ ;*´ ¡ § *´ £ § €™ *´ 9§ *´ ¤ *´ ‡o9¯       .    =  >  ?  @  A  B 7 C = D @ E H F Q H     4    T ! "    Q N 
   N O 
   L P 
   I Q   R   ' ÿ     @Kÿ       S    T