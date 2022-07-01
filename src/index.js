import React from "react";
import { View, Text, SafeAreaView } from "react-native";


export default App=(props)=>{
    console.log("Native Props",props);
    return(
        <SafeAreaView>
            <Text style={{fontSize:20,marginTop:100,alignSelf:"center"}}>{props.images}</Text>
        </SafeAreaView>
    );
}