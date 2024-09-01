

public class Main {

	public static void main(String[] args) {
		int n=140;
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if((j==63||j==64)&&i==10) {
					System.out.print("&");
				}
				else if((j==65||j==66||j==67)&&i==10) {
					System.out.print("%");
				}
				else if(j==68&&i==10) {
					System.out.print("#");
				}
				else if(j==69&&i==10) {
					System.out.print("(");
				}
				else if(j==70&&i==10) {
					System.out.print("/");
				}
				else if((j==71||j==72)&&i==10) {
					System.out.print(",");
				}
				else if((j>72&&j<77)&&i==10) {
					System.out.print("*");
				}
				else if(j==77&&i==10) {
					System.out.print("%");
				}
				else if(j==58&&i==11) {
					System.out.print("%");
				}
				else if(j==59&&i==11) {
					System.out.print("/");
				}
				else if((j>59&&j<64)&&i==11) {
					System.out.print(",");
				}
				else if(j>=64&&j<=72&&i==11) {
					System.out.print(".");
				}
				else if(j>=73&&j<=76&&i==11) {
					System.out.print(",");
				}
				else if(j==77&&i==11) {
					System.out.print("*");
				}
				else if(j==78&&i==11) {
					System.out.print("(");
				}
				else if(j==54&&i==12) {
					System.out.print("(");
				}
				else if(j==55&&i==12) {
					System.out.print(",");
				}
				else if(j>=56&&j<=76&&i==12) {
					System.out.print(".");
				}
				else if((j==77||j==78)&&i==12) {
					System.out.print(",");
				}
				else if(j==79&&i==12) {
					System.out.print("(");
				}
				else if(j==50&&i==13) {
					System.out.print("&");
				}
				else if(j==51&&i==13) {
					System.out.print("*");
				}
				else if(j>=52&&j<=60&&i==13) {
					System.out.print(".");
				}
				else if((j==61||j==62)&&i==13) {
					System.out.print(",");
				}
				else if(j>=63&&j<=69&&i==13) {
					System.out.print(".");
				}
				else if(j==70&&i==13) {
					System.out.print(",");
				}
				else if(j>=71&&j<=75&&i==13) {
					System.out.print(".");
				}
				else if(j>=76&&j<=78&&i==13) {
					System.out.print(",");
				}
				else if(j==79&&i==13) {
					System.out.print("*");
				}
				else if(j==80&&i==13) {
					System.out.print("#");
				}
				else if(j==48&&i==14) {
					System.out.print("/");
				}
				else if(j==49&&i==14) {
					System.out.print(",");
				}
				else if(j>=50&&j<=55&&i==14) {
					System.out.print(".");
				}
				else if(j==56&&i==14) {
					System.out.print(",");
				}
				else if((j==57||j==58)&&i==14) {
					System.out.print(".");
				}
				else if((j>=59&&j<=61&&i==14)) {
					System.out.print(",");
				}
				else if(j>=62&&j<=66&&i==14) {
					System.out.print(".");
				}
				else if(j>=67&&j<=79&&i==14) {
					System.out.print(",");
				}
				else if(j==80&&i==14) {
					System.out.print("*");
				}
				else if((j==81||j==82)&&i==14) {
					System.out.print(".");
				}
				else if(j==83&&i==14) {
					System.out.print(",");
				}
				else if(j==84&&i==14) {
					System.out.print("*");
				}
				else if(j==85&&i==14) {
					System.out.print("(");
				}
				else if(j==86&&i==14) {
					System.out.print("&");
				}
				else if(j==47&&i==15) {
					System.out.print("#");
				}
				else if(j>=48&&j<=62&&i==15) {
					System.out.print(",");
				}
				else if(j>=63&&j<=68&&i==15) {
					System.out.print(".");
				}
				else if(j>=69&&j<=81&&i==15) {
					System.out.print(",");
				}
				else if(j==82&&i==15) {
					System.out.print(".");
				}
				else if(j==83&&i==15) {
					System.out.print(",");
				}
				else if(j>=84&&j<=87&&i==15) {
					System.out.print("*");
				}
				else if(j==88&&i==15) {
					System.out.print("#");
				}
				else if(j==45&&i==16) {
					System.out.print("&");
				}
				else if(j==46&&i==16) {
					System.out.print("*");
				}
				else if(j>=47&&j<=65&&i==16) {
					System.out.print(",");
				}
				else if((j==66||j==67)&&i==16) {
					System.out.print("*");
				}
				else if(j==68&&i==16) {
					System.out.print("(");
				}
				else if(j==69&&i==16) {
					System.out.print("#");
				}
				else if(j==70&&i==16) {
					System.out.print("%");
				}
				else if(j>=71&&j<=76&&i==16) {
					System.out.print("&");
				}
				else if((j==77||j==78)&&i==16) {
					System.out.print("%");
				}
				else if((j==79||j==80)&&i==16) {
					System.out.print("#");
				}
				else if(j==81&&i==16) {
					System.out.print("(");
				}
				else if((j==82||j==83)&&i==16) {
					System.out.print("*");
				}
				else if(j>=84&&j<=88&&i==16) {
					System.out.print(",");
				}
				else if(j==89&&i==16) {
					System.out.print("/");
				}
				else if(j==45&&i==17) {
					System.out.print("*");
				}
				else if(j>=46&&j<=48&&i==17) {
					System.out.print(",");
				}
				else if((j==49||j==50)&&i==17) {
					System.out.print(".");
				}
				else if(j>=51&&j<=54&&i==17) {
					System.out.print(",");
				}
				else if(j==55&&i==17) {
					System.out.print("/");
				}
				else if(j>=56&&j<=58&&i==17) {
					System.out.print("#");
				}
				else if((j==59||j==60)&&i==17) {
					System.out.print("%");
				}
				else if(j>=61&&j<=66&&i==17) {
					System.out.print("&");
				}
				else if((j==67||j==68)&&i==17) {
					System.out.print("%");
				}
				else if(j>=69&&j<=80&&i==17) {
					System.out.print("&");
				}
				else if((j==81||j==82)&&i==17) {
					System.out.print("%");
				}
				else if(j==83&&i==17) {
					System.out.print("#");
				}
				else if(j==84&&i==17) {
					System.out.print("*");
				}
				else if(j>=85&&j<=90&&i==17) {
					System.out.print(",");
				}
				else if(j==91&&i==17) {
					System.out.print("/");
				}
				else if(j==44&&i==18) {
					System.out.print("#");
				}
				else if(j==45&&i==18) {
					System.out.print(",");
				}
				else if(j==46&&i==18) {
					System.out.print(".");
				}
				else if(j>=47&&j<=52&&i==18) {
					System.out.print(",");
				}
				else if(j==53&&i==18) {
					System.out.print("*");
				}
				else if(j==54&&i==18) {
					System.out.print("#");
				}
				else if(j>=55&&j<=58&&i==18) {
					System.out.print("%");
				}
				else if(j>=59&&j<=80&&i==18) {
					System.out.print("&");
				}
				else if(j>=81&&j<=83&&i==18) {
					System.out.print("%");
				}
				else if(j==84&&i==18) {
					System.out.print("#");
				}
				else if(j==85&&i==18) {
					System.out.print("*");
				}
				else if(j>=86&&j<=88&&i==18) {
					System.out.print(",");
				}
				else if(j>=89&&j<=91&&i==18) {
					System.out.print(".");
				}
				else if(j==92&&i==18) {
					System.out.print("*");
				}
				else if(j==44&&i==19) {
					System.out.print("&");
				}
				else if(j==45&&i==19) {
					System.out.print(",");
				}
				else if(j==46&&i==19) {
					System.out.print(".");
				}
				else if((j==47||i==48)&&i==19) {
					System.out.print(",");
				}
				else if(j>=49&&j<=51&&i==19) {
					System.out.print(".");
				}
				else if(j==52&&i==19) {
					System.out.print("/");
				}
				else if(j>=53&&j<=56&&i==19) {
					System.out.print("%");
				}
				else if(j>=57&&j<=80&&i==19) {
					System.out.print("&");
				}
				else if(j>=81&&j<=84&&i==19) {
					System.out.print("%");
				}
				else if(j==85&&i==19) {
					System.out.print("(");
				}
				else if((j==86||j==87)&&i==19) {
					System.out.print("*");
				}
				else if(j==88&&i==19) {
					System.out.print(",");
				}
				else if((j==89||j==90)&&i==19) {
					System.out.print(".");
				}
				else if(j==91&&i==19) {
					System.out.print("*");
				}
				else if(j==92&&i==19) {
					System.out.print("&");
				}
				else if(j==45&&i==20) {
					System.out.print("#");
				}
				else if(j>=46&&j<=49&&i==20) {
					System.out.print(".");
				}
				else if(j==50&&i==20) {
					System.out.print(",");
				}
				else if(j==51&&i==20) {
					System.out.print("*");
				}
				else if(j==52&&i==20) {
					System.out.print("#");
				}
				else if(j>=53&&j<=57&&i==20) {
					System.out.print("%");
				}
				else if(j>=58&&j<=68&&i==20) {
					System.out.print("&");
				}
				else if(j>=76&&j<=84&&i==20) {
					System.out.print("&");
				}
				else if(j==85&&i==20) {
					System.out.print("(");
				}
				else if(j==86&&i==20) {
					System.out.print(",");
				}
				else if((j==87||j==88)&&i==20) {
					System.out.print(".");
				}
				else if(j==89&&i==20) {
					System.out.print(",");
				}
				else if(j==90&&i==20) {
					System.out.print("(");
				}
				else if(j==46&&i==21) {
					System.out.print("(");
				}
				else if(j==47&&i==21) {
					System.out.print(".");
				}
				else if(j==48&&i==21) {
					System.out.print(",");
				}
				else if((j==49||j==50)&&i==21) {
					System.out.print(".");
				}
				else if(j==51&&i==21) {
					System.out.print("(");
				}
				else if(j>=52&&j<=55&&i==21) {
					System.out.print("%");
				}
				else if(j>=56&&j<=66&&i==21) {
					System.out.print("&");
				}
				else if(j>=71&&j<=84&&i==21) {
					System.out.print("&");
				}
				else if(j==85&&i==21) {
					System.out.print("%");
				}
				else if(j==86&&i==21) {
					System.out.print(",");
				}
				else if((j==87||j==88)&&i==21) {
					System.out.print(".");
				}
				else if(j==89&&i==21) {
					System.out.print(",");
				}
				else if(j==90&&i==21) {
					System.out.print("#");
				}
				else if(j==47&&i==22) {
					System.out.print(",");
				}
				else if(j>=48&&j<=50&&i==22) {
					System.out.print(".");
				}
				else if(j==51&&i==22) {
					System.out.print("#");
				}
				else if((j==52||j==53)&&i==22) {
					System.out.print("%");
				}
				else if(j==54&&i==22) {
					System.out.print("(");
				}
				else if(j>=55&&j<=57&&i==22) {
					System.out.print("*");
				}
				else if(j>=58&&j<=62&&i==22) {
					System.out.print(",");
				}
				else if(j==63&&i==22) {
					System.out.print("*");
				}
				else if(j==64&&i==22) {
					System.out.print("(");
				}
				else if(j==65&&i==22) {
					System.out.print("#");
				}
				else if(j==66&&i==22) {
					System.out.print("%");
				}
				else if(j>=67&&j<=70&&i==22) {
					System.out.print("&");
				}
				else if(j==71&&i==22) {
					System.out.print("%");
				}
				else if(j==72&&i==22) {
					System.out.print("#");
				}
				else if(j==73&&i==22) {
					System.out.print("(");
				}
				else if(j==74&&i==22) {
					System.out.print("/");
				}
				else if(j==75&&i==22) {
					System.out.print("*");
				}
				else if((j==76||j==77)&&i==22) {
					System.out.print(",");
				}
				else if((j==78||j==79)&&i==22) {
					System.out.print("*");
				}
				else if(j==80&&i==22) {
					System.out.print("/");
				}
				else if((j==81||j==82)&&i==22) {
					System.out.print("(");
				}
				else if(j==83&&i==22) {
					System.out.print("/");
				}
				else if(j==84&&i==22) {
					System.out.print("#");
				}
				else if(j==85&&i==22) {
					System.out.print("%");
				}
				else if(j==86&&i==22) {
					System.out.print("(");
				}
				else if((j==87||j==88)&&i==22) {
					System.out.print(".");
				}
				else if(j==89&&i==22) {
					System.out.print(",");
				}
				else if(j==90&&i==22) {
					System.out.print("&");
				}
				else if(j==47&&i==23){
					System.out.print("%");
				}
				else if(j==48&&i==23) {
					System.out.print(",");
				}
				else if((j==49||j==50)&&i==23) {
					System.out.print(".");
				}
				else if(j==51&&i==23) {
					System.out.print("(");
				}
				else if(j==52&&i==23) {
					System.out.print("%");
				}
				else if(j>=53&&j<=58&&i==23) {
					System.out.print("#");
				}
				else if(j==59&&i==23) {
					System.out.print("%");
				}
				else if(j>=60&&j<=65&&i==23) {
					System.out.print("#");
				}
				else if(j==66&&i==23) {
					System.out.print("%");
				}
				else if(j>=67&&j<=71&&i==23) {
					System.out.print("&");
				}
				else if(j==72&&i==23) {
					System.out.print("%");
				}
				else if((j==73||j==74)&&i==23) {
					System.out.print("#");
				}
				else if((j==75||j==76)&&i==23) {
					System.out.print("(");
				}
				else if(j==77&&i==23) {
					System.out.print("/");
				}
				else if(j==78&&i==23) {
					System.out.print("(");
				}
				else if(j>=79&&j<=81&&i==23) {
					System.out.print("#");
				}
				else if(j>=82&&j<=85&&i==23) {
					System.out.print("%");
				}
				else if(j==86&&i==23) {
					System.out.print("(");
				}
				else if((j==87||j==88)&&i==23) {
					System.out.print(".");
				}
				else if(j==89&&i==23) {
					System.out.print(",");
				}
				else if((j==48||(j>=52&&j<=54)||j==58||j==66||j==67||(j>=71&&j<=73)||j==78||j==79||j==81||j==82||j==85)&&i==24) {
					System.out.print("%");
				}
				else if((j==49||j==50||j==88)&&i==24) {
					System.out.print(".");
				}
				else if((j==51||j==56||j==57||j==59||j==63||j==89)&&i==24) {
					System.out.print("(");
				}
				else if((j==55||j==64||j==65||(j>=74&&j<=77)||j==80||j==86)&&i==24) {
					System.out.print("#");
				}
				else if((j==62||(j>=68&&j<=70)||j==83||j==84)&&i==24) {
					System.out.print("&");
				}
				else if((j==60||j==87)&&i==24) {
					System.out.print(",");
				}
				else if(j==61&&i==24) {
					System.out.print("/");
				}
				else if((j==47||(j>=67&&j<=73)||j==75||j==76||(j>=81&&j<=84)||j==90)&&i==25) {
					System.out.print("&");
				}
				
				else if((j==48||j==49||(j>=57&&j<=62)||j==86||j==89)&&i==25) {
					System.out.print("#");
				}
				else if((j==50||j==87)&&i==25) {
					System.out.print("*");
				}
				else if((j==51||j==88)&&i==25) {
					System.out.print("(");
				}
				else if(((j>=52&&j<=56)||(j>=63&&j<=66)||j==74||(j>=77&&j<=80)||j==85)&&i==25) {
					System.out.print("%");
				}
				else if((j==48||j==50||j==52||j==65||j==66||j==86||j==89)&&i==26) {
					System.out.print("%");
				}
				else if((j==49||(j>=53&&j<=64)||(j>=67&&j<=74)||(j>=77&&j<=85)||j==87||j==88)&&i==26) {
					System.out.print("&");
				}
				else if(j==51&&i==26) {
					System.out.print("#");
				}
				else if((j==49||j==52||j==53||j==63||j==65||j==66||j==70||j==85||j==87)&&i==27) {
					System.out.print("%");
				}
				else if((j==50||j==71||j==72||j==86)&&i==27) {
					System.out.print("#");
				}
				else if(j==51&&i==27) {
					System.out.print("(");
				}
				else if(((j>=54&&j<=62)||j==64||(j>=67&&j<=69)||(j>=73&&j<=75)||j==83||j==84||j==88||j==89)&&i==27) {
					System.out.print("&");
				}
				else if((j==49||(j>=55&&j<=61)||(j>=74&&j<=78)||(j>=83&&j<=85)||j==87||j==88)&&i==28) {
					System.out.print("&");
				}
				else if((j==50||j==67||j==68||j==86)&&i==28) {
					System.out.print("#");
				}
				else if(j==51&&i==28) {
					System.out.print("/");
				}
				else if(((j>=52&&j<=54)||(j>=62&&j<=66)||(j>=69&&j<=73))&&i==28) {
					System.out.print("%");
				}
				else if(((j==50)||(j>=55&&j<=59)||(j>=78&&j<=84)||j==88)&&i==29) {
					System.out.print("&");
				}
				else if((j==51||j==62||j==75||j==76)&&i==29) {
					System.out.print("(");
				}
				else if((j==52||j==61||j==86)&&i==29) {
					System.out.print("#");
				}
				else if((j==53||j==54||j==60||j==77||j==85||j==87)&&i==29) {
					System.out.print("%");
				}
				else if(((j>=64&&j<=67)||(j>=70&&j<=72))&&i==29) {
					System.out.print("*");
				}
				else if((j==63||j==68||j==69||j==73||j==74)&&i==29) {
					System.out.print("/");
				}
				else if((j==51||(j>=80&&j<=83)||j==86)&&i==30) {
					System.out.print("&");
				}
				else if((j==52||j==63||j==75)&&i==30) {
					System.out.print("(");
				}
				else if((j==53||j==64)&&i==30) {
					System.out.print("#");
				}
				else if(((j>=54&&j<=58)||(j>=65&&j<=74)||j==79||j==84||j==85)&&i==30) {
					System.out.print("%");
				}
				else if((j==59||j==62||j==76||j==78)&&i==30) {
					System.out.print("/");
				}
				else if((j==60||j==61||j==77)&&i==30) {
					System.out.print("*");
				}
				else if((j==52||(j>=65&&j<=73))&&i==31) {
					System.out.print("&");
				}
				else if((j==53||j==61||j==77||j==78)&&i==31) {
					System.out.print("(");
				}
				else if(((j>=54&&j<=58)||j==62||j==76||j==84)&&i==31) {
					System.out.print("#");
				}
				else if((j==59||j==60)&&i==31) {
					System.out.print("/");
				}
				else if((j==63||j==64||j==74||j==75||(j>=79&&j<=83)||j==85)&&i==31) {
					System.out.print("%");
				}
				else if(((j>=53&&j<=56)||(j>=58&&j<=60)||j==78||j==84)&&i==32) {
					System.out.print("(");
				}
				else if((j==57||j==66||j==70||j==77)&&i==32) {
					System.out.print("/");
				}
				else if((j==61||j==65||j==71||j==76||(j>=79&&j<=83))&&i==32) {
					System.out.print("#");
				}
				else if(((j>=62&&j<=64)||(j>=72&&j<=75))&&i==32) {
					System.out.print("%");
				}
				else if((j>=67&&j<=69)&&i==32) {
					System.out.print("*");
				}
				else if((j==54||j==70||j==71)&&i==33) {
					System.out.print("%");
				}
				else if((j==55||j==58||j==60||j==61||j==76||j==82)&&i==33) {
					System.out.print("*");
				}
				else if((j==56||j==62||j==79)&&i==33) {
					System.out.print("/");
				}
				else if((j==57||j==63||j==74||j==75||j==81)&&i==33) {
					System.out.print("(");
				}
				else if((j==59||j==77||j==78)&&i==33) {
					System.out.print(",");
				}
				else if(((j>=64&&j<=69)||j==72||j==73||j==80||j==83)&&i==33) {
					System.out.print("#");
				}
				else if((j==55||j==81)&&i==34) {
					System.out.print("%");
				}
				else if(j==56&&i==34) {
					System.out.print("/");
				}
				else if((j==57||(j>=66&&j<=72)||j==80)&&i==34) {
					System.out.print("*");
				}
				else if((j==58||(j>=61&&j<=65)||(j>=73&&j<=76)||j==78||j==79)&&i==34) {
					System.out.print(",");
				}
				else if((j==59||j==60||j==77)&&i==34) {
					System.out.print(".");
				}
				else if((j==55||j==81)&&i==35) {
					System.out.print("&");
				}
				else if((j==56||j==57||j==79||j==80)&&i==35) {
					System.out.print("%");
				}
				else if((j==58||j==77)&&i==35) {
					System.out.print("*");
				}
				else if(((j>=59&&j<=76))&&i==35) {
					System.out.print(".");
				}
				else if(j==78&&i==35) {
					System.out.print("#");
				}
				else if((j==55||(j>=78&&j<=82))&&i==36) {
					System.out.print("&");
				}
				else if(((j>=56&&j<=60)||(j>=75&&j<=77))&&i==36) {
					System.out.print("%");
				}
				else if((j==61||j==73)&&i==36) {
					System.out.print("(");
				}
				else if((j==62||j==72)&&i==36) {
					System.out.print("*");
				}
				else if((j==63||j==64||j==71)&&i==36) {
					System.out.print(",");
				}
				else if((j>=65&&j<=70)&&i==36) {
					System.out.print(".");
				}
				else if(j==74&&i==36) {
					System.out.print("#");
				}
				else if((j==51||(j>=56&&j<=59)||(j>=76&&j<=81)||j==87)&&i==37) {
					System.out.print("&");
				}
				else if((j==52||(j>=84&&j<=86))&&i==37) {
					System.out.print("#");
				}
				else if(j==53&&i==37) {
					System.out.print("(");
				}
				else if((j==54||j==55||(j>=60&&j<=75)||j==82||j==83)&&i==37) {
					System.out.print("%");
				}
				else if((j==49||(j>=55&&j<=62)||(j>=73&&j<=83))&&i==38) {
					System.out.print("&");
				}
				else if((j==50||j==53)&&i==38) {
					System.out.print("#");
				}
				else if((j==51||j==52||j==85)&&i==38) {
					System.out.print(",");
				}
				else if((j==54||(j>=63&&j<=72)||j==84||j==88)&&i==38) {
					System.out.print("%");
				}
				else if(j==87&&i==38) {
					System.out.print("(");
				}
				else if(j==86&&i==38) {
					System.out.print("*");
				}
				else if((j==49||(j>=53&&j<=67)||(j>=70&&j<=84))&&i==39) {
					System.out.print("&");
				}
				else if(j==50&&i==39) {
					System.out.print("*");
				}
				else if(j==51&&i==39) {
					System.out.print(",");
				}
				else if((j==52||j==68||j==69||j==85)&&i==39) {
					System.out.print("%");
				}
				else if(j==86&&i==39) {
					System.out.print("/");
				}
				else if(j==87&&i==39) {
					System.out.print(".");
				}
				else if(j==88&&i==39) {
					System.out.print("#");
				}
				else if(j==50&&i==40) {
					System.out.print("*");
				}
				else if(j==51&&i==40) {
					System.out.print(".");
				}
				else if((j==52||j==87)&&i==40) {
					System.out.print("/");
				}
				else if((j>=53&&j<=84)&&i==40) {
					System.out.print("&");
				}
				else if(j==85&&i==40) {
					System.out.print("%");
				}
				else if(j==86&&i==40) {
					System.out.print(",");
				}
				else if((j==49||(j>=55&&j<=76)||j==80||j==87)&&i==41) {
					System.out.print("&");
				}
				else if(j==50&&i==41) {
					System.out.print("*");
				}
				else if(j==51&&i==41) {
					System.out.print(".");
				}
				else if((j==52||j==85||j==86)&&i==41) {
					System.out.print(",");
				}
				else if(j==53&&i==41) {
					System.out.print("/");
				}
				else if(j==54&&i==41) {
					System.out.print("%");
				}
				else if(j==84&&i==41) {
					System.out.print("#");
				}
				else if(j==50&&i==42) {
					System.out.print("%");
				}
				else if(((j>=51&&j<=53)||j==84)&&i==42) {
					System.out.print(",");
				}
				else if(j==54&&i==42) {
					System.out.print("*");
				}
				else if(j==55&&i==42) {
					System.out.print("#");
				}
				else if(((j>=56&&j<=70)||j==73||j==74||j==82)&&i==42) {
					System.out.print("&");
				}
				else if((j==83||j==85)&&i==42) {
					System.out.print("/");
				}
				else if((j==51||j==84)&&i==43) {
					System.out.print("*");
				}
				else if(((j>=52&&j<=55)||j==82||j==83)&&i==43) {
					System.out.print(",");
				}
				else if((j==56||j==81)&&i==43) {
					System.out.print("(");
				}
				else if((j==57||j==58||j==60||j==79||j==80)&&i==43) {
					System.out.print("&");
				}
				else if(j==51&&i==44) {
					System.out.print("%");
				}
				else if(((j>=52&&j<=57)||(j>=80&&j<=83))&&i==44) {
					System.out.print(",");
				}
				else if(j==58&&i==44) {
					System.out.print("#");
				}
				else if((j==59||j==78||j==84)&&i==44) {
					System.out.print("&");
				}
				else if(j==79&&i==44) {
					System.out.print("/");
				}
				else if((j==52||j==55||j==56||j==60||j==78||j==80)&&i==45) {
					System.out.print("*");
				}
				else if((j==53||j==54||(j>=57&&j<=59)||j==77||j==79||j==81||j==82)&&i==45) {
					System.out.print(",");
				}
				else if((j==61||j==75)&&i==45) {
					System.out.print("%");
				}
				else if(j==74&&i==45) {
					System.out.print("&");
				}
				else if(j==76&&i==45) {
					System.out.print("/");
				}
				else if(j==83&&i==45) {
					System.out.print("#");
				}
				else if(j==52&&i==46) {
					System.out.print("%");
				}
				else if((j>=53&&j<=81)&&i==46) {
					System.out.print(",");
				}
				else if(j==82&&i==46) {
					System.out.print("(");
				}
				else if((j==53||j==81)&&i==47) {
					System.out.print("*");
				}
				else if((j>=54&&j<=80)&&i==47) {
					System.out.print(",");
				}
				else if(j==53&&i==48) {
					System.out.print("%");
				}
				else if((j>=54&&j<=79)&&i==48) {
					System.out.print(",");
				}
				else if(j==80&&i==48) {
					System.out.print("*");
				}
				else if(j==81&&i==48) {
					System.out.print("&");
				}
				else if(j==54&&i==49) {
					System.out.print("*");
				}
				else if((j>=55&&j<=79)&&i==49) {
					System.out.print(",");
				}
				else if(j==80&&i==49) {
					System.out.print("%");
				}
				else if(j==54&&i==50) {
					System.out.print("%");
				}
				else if((j>=55&&j<=78)&&i==50) {
					System.out.print(",");
				}
				else if(j==79&&i==50) {
					System.out.print("(");
				}
				else if((j==55||j==78)&&i==51) {
					System.out.print("/");
				}
				else if((j>=56&&j<=77)&&i==51) {
					System.out.print(",");
				}
				else if((j==55||j==78)&&i==52) {
					System.out.print("&");
				}
				else if((j>=56&&j<=76)&&i==52) {
					System.out.print(",");
				}
				else if(j==77&&i==52) {
					System.out.print("*");
				}
				else if(j==56&&i==53) {
					System.out.print("#");
				}
				else if((j>=57&&j<=76)&&i==53) {
					System.out.print(",");
				}
				else if(j==77&&i==53) {
					System.out.print("%");
				}
				else if(j==57&&i==54) {
					System.out.print("*");
				}
				else if((j>=58&&j<=75)&&i==54) {
					System.out.print(",");
				}
				else if(j==76&&i==54) {
					System.out.print("#");
				}
				else if(j==57&&i==55) {
					System.out.print("%");
				}
				else if((j>=58&&j<=74)&&i==55) {
					System.out.print(",");
				}
				else if(j==75&&i==55) {
					System.out.print("/");
				}
				else {
					System.out.print("@");
				}
			}
			
			System.out.println();
		}

	}

}
