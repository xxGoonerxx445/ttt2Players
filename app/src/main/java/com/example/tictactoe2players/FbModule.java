package com.example.tictactoe2players;

import android.content.Context;

import androidx.annotation.NonNull;

import com.google.firebase.Firebase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class FbModule {
    private Context context;
    FirebaseDatabase firebaseDatabase;
    DatabaseReference reference;

    public FbModule(Context context) {
        this.context = context;
      initFirebaseListener();
         firebaseDatabase= FirebaseDatabase.getInstance();
         reference=firebaseDatabase.getReference("play");



    }
    private void initFirebaseListener() {

        reference.addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                Position position=snapshot.getValue(Position.class);
                if(position!=null) //בודק שלא קוראים מצומת לא קיים בפיירבייס
                    ((GameActivty)context).setPositionFromFb(position);

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
    public void setPositionInFireBase(Position position){
        reference.setValue(position);
    }

}
