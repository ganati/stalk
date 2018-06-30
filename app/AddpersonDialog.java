package com.example.ganati.exampleapp;

public class AddpersonDialog extends DialogFragment {

    interface personDialogListener{


        void onSaveButtonClick(DialogFrafment dialog);

    }

    AddpersonDialogListener addpersonListener;
    Context context;

    @Overrride

    public void onAttach(Activity activity){

        super.onAttach(activity);
        try{
            addpersonListener = (AddpersonDialogListener) activity;

        } catch (ClasscaseException e){
            throw new ClasscaseExcept(activity.tostring() + "must implement AddDialogListener");

        }

    }
}

@Override
public Dialog onCreateDialog(Bundle savedInstanceState){

    AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

    LayoutInflater inflater = getActivity().getLayoutInflater();

    builder.setview(inflater.inflater(R.layout.person_perform,null)).setPositiveButton("ADD", (dialog, username){

                addpersonListener.onSaveButtonClick(AddpersonDialog.this)
    })
    .setNegativeButton("CANCEL",(dialog, username){
        AddpersonDialog.this.getDialog().cancel();
    } );

    return builder.create();
    }


}