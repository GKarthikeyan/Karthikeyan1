/* code for exit Button */ 
 
 Button b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View arg0) {
                final AlertDialog.Builder ab=new AlertDialog.Builder(MainActivity.this);
                ab.setMessage("Are u sure want to exit?");
                //ab.setCancelable(false);
                ab.setPositiveButton("yes", new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        MainActivity.this.finish();
                    }
                });

                ab.setNegativeButton("No",new DialogInterface.OnClickListener() {

                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {
                        arg0.cancel();

                    }
                });

                AlertDialog ad=ab.create();
                ad.show();

            }
        });
