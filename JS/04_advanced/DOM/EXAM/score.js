function output(){
  var sum = new Array();
  var avg = new Array();
  var sum1 = new Array();
  var rank = new Array();
  var name = new Array();

  sum1[0]=0;
  sum1[1]=0;
  sum1[2]=0;
  sum1[3]=0;

  name[0]=name1.value;
  name[1]=name2.value;
  name[2]=name3.value;
  name[3]=name4.value;
  name[4]=name5.value;

 

  var scoreC = new Array();
  	scoreC[0]=parseInt(namec1.value);
  	scoreC[1]=parseInt(namec2.value);
  	scoreC[2]=parseInt(namec3.value);
  	scoreC[3]=parseInt(namec4.value);
  	scoreC[4]=parseInt(namec5.value);

  var scoreJ = new Array();
  	scoreJ[0]=parseInt(name1j.value);
  	scoreJ[1]=parseInt(name2j.value);
  	scoreJ[2]=parseInt(name3j.value);
  	scoreJ[3]=parseInt(name4j.value);
  	scoreJ[4]=parseInt(name5j.value);

  var scoreH = new Array();
  	scoreH[0]=parseInt(name1h.value);
  	scoreH[1]=parseInt(name2h.value);
  	scoreH[2]=parseInt(name3h.value);
  	scoreH[3]=parseInt(name4h.value);
  	scoreH[4]=parseInt(name5h.value);

  for(var i=0; i<name.length; i++) {   
      sum[i] = scoreC[i] + scoreH[i] + scoreJ[i];
      avg[i] = parseInt(sum[i]/3);
      sum1[0] = sum1[0]+scoreC[i];
      sum1[1] = sum1[1]+scoreJ[i];
      sum1[2] = sum1[2]+scoreH[i];
      sum1[3] = sum1[3]+sum[i];

  }

  name1sum.value = sum[0];
  name2sum.value = sum[1];
  name3sum.value = sum[2];
  name4sum.value = sum[3];
  name5sum.value = sum[4];
  name1avg.value = avg[0];
  name2avg.value = avg[1];
  name3avg.value = avg[2];
  name4avg.value = avg[3];
  name5avg.value = avg[4];
  
  csum.value = sum1[0];
  hsum.value = sum1[1];
  jsum.value = sum1[2];
  total.value = sum1[3];

  for(var i=0; i<name.length; i++) {   
    rank[i]=1;
        for(j=0; j<name.length; j++) {
          if(avg[i]<avg[j]) {
            rank[i]++;
              if(avg[i]==avg[j])        
                rank[i]++;
                
          }
        }
  }
  	name1rank.value = rank[0];
  	name2rank.value = rank[1];
  	name3rank.value = rank[2];
  	name4rank.value = rank[3];
  	name5rank.value = rank[4];

}