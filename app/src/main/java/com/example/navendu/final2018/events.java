package com.example.navendu.final2018;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.util.HashMap;

public class events extends AppCompatActivity {



    String[] arr={"spandan","anushtaan","switch the funk up","balladeers","vocalicious","vrind","twos a show","acoustic alchemy","nukkad","natya"
            ,"paridhan","the selfie brag","live wire","edm","rock","war of words","creative writing","mixed bag","kavyaanjana","jam","drishtikon","shoe",

            "art and furious","3 dimensional art","film making","shakedown","standup","kawi","arte photographia","poker","zorbing","cricket",
            "vr theatre","paintball","segway"
    };

    String s1="https://docs.google.com/forms/d/e/1FAIpQLSeeVul0uHFHSxW8Jm44GeHTD8s1E8U2URzD8psmPeAeWv4f6Q/viewform?usp=sf_link";
    String s2="https://docs.google.com/forms/d/e/1FAIpQLSdYITDaCWgDS4HVJpzj-Wiw8Cj60SgUSTaQDStUhYhLvtHSaQ/viewform?usp=sf_link";
    String s3="";
    String s4="https://docs.google.com/forms/d/e/1FAIpQLSfxx553MhT7F3WU11zQVevhb8PL4zahfAy89EB07W47JaQ5mA/viewform?usp=sf_link\n";
    String s5="https://docs.google.com/forms/d/e/1FAIpQLSeeTmswX_OVnBfoowyGK-JiXO9LA86ckSRDIfPdPhL9Bx46uQ/viewform?usp=sf_link";
    String s6="https://docs.google.com/forms/d/e/1FAIpQLScEHWBu7am04Y0TCrAeNKrEaRu_uxipVHEOOMLGnUUksNaT7g/viewform?usp=sf_link";
    String s7="https://docs.google.com/forms/d/e/1FAIpQLSfdK4-S76_X0N9TIySgiZCc8Ps4muctZ20XBk9eOwidHP3d2w/viewform?usp=sf_link";
    String s8="";
    String s9="https://docs.google.com/forms/d/e/1FAIpQLSdS-4c_bTTjRi6X0UZwZ7Lgw9vRNUjVi_WlFFLtHRgbFUIGzQ/viewform?usp=sf_link";
    String s10="https://docs.google.com/forms/d/e/1FAIpQLScNrnaqrfieUrjjtSSGvKey-yfRNI4_2jF4gqYXFGwDfi0UPA/viewform?usp=sf_link";
    String s11="https://docs.google.com/forms/d/e/1FAIpQLScq3oAOQxZyY8dTbAspnYkPgY7CSkz3idKhvzMo078Cu-fPMw/viewform?usp=sf_link";
    String s12="https://docs.google.com/forms/d/e/1FAIpQLSe6Jlet_1R9ZvCOja60tepb4_9ow7m1SFABEFf8MyaFcgJysw/viewform?usp=sf_link";
    String s13="";
    String s14="";
    String s15="";
    String s16="";
    String s17="https://docs.google.com/forms/d/e/1FAIpQLSebApbm_wY1lUEN6JFyMBoNX4HFPjtzWK6AJc9LcVqamfUGMA/viewform?usp=sf_link";
    String s18="https://docs.google.com/forms/d/e/1FAIpQLSdsmWZ5fZ79k-gceJ6-0Abo92mw3gx5wdXzByOKjg20SC4mAQ/viewform?usp=sf_link";
    String s19="";
    String s20="";
    String s21="";
    String s22="https://docs.google.com/forms/d/e/1FAIpQLScwnapELMl8HZ6Cz1UxcTCaj5aGiPrOQhHE-Gcvmt_gCBfjsQ/viewform?usp=sf_link";
    String s23="https://docs.google.com/forms/d/e/1FAIpQLSfoCIdxYOy6hG1SheZYw5wSemjnBZlpW3ZS5rm4kAgn6KEE2g/viewform?usp=sf_link\n";
    String s24="https://docs.google.com/forms/d/e/1FAIpQLSfs1Vrs1KyRnuGV7irZDwI_1jVHJoQ75tAvNmp1aM9FEB6dGQ/viewform?usp=sf_link\n";


    String r1="";
    String r2="";
    String r3="";
    String r4=" Engi-Idol (Indian Solo Singing Competition)\n" +
            "\n" +
            "Let your notes mesmerize everyone and win all hearts. If you've got the sur, the lay and the taal, let them do your talking.\n" +
            "\n" +
            "REGISTRATION:\n" +
            "\n" +
            "Registration has to be done ONLINE ONLY. There will be NO on the spot registration.\n" +
            "\n" +
            "Registration link:.\n" +
            "\n" +
            "ONLINE PRELIMS:\n" +
            "\n" +
            "Send your recording (audio/video) or the link to your YouTube video to madhurima.indian@gmail.com.\n" +
            "\n" +
            "RULES:\n" +
            "\n" +
            "1. Each participant is allotted a total of 6 minutes including setup.\n" +
            "\n" +
            "2. One accompanying instrument is allowed.\n" +
            "\n" +
            "3. Karaoke track can be used.\n" +
            "\n" +
            "4. All required instruments besides acoustic guitar and synthesizer have to be brought by the participants.\n" +
            "\n" +
            "5. Genre for the performance should be light classical or Bollywood. Purely classical songs are prohibited.\n\n" +
            "JUDGING CRITERIA: Quality of singing, creativity, vocal range, clarity in lyrics and overall impact.";
    String r5="Vocalicious (Western Solo Singing Competition)\n" +
            "\n" +
            "Does your hand yearn to reach out for the mike? Is the stage your second home and the audience your second family? Then come, be a part of Vocalicious. The stage awaits you.\n" +
            "\n" +
            "REGISTRATION:\n" +
            "\n" +
            "Registration has to be done ONLINE ONLY. There will be NO on the spot registration.\n" +
            "\n" +
            "Registration link:.\n" +
            "\n" +
            "ONLINE PRELIMS: Send your recording (audio/video) or the link to your YouTube video to madhurima.western@gmail.com.\n" +
            "\n" +
            "RULES:\n" +
            "\n" +
            "1. Each participant is allotted a total of 6 minutes including setup.\n" +
            "\n" +
            "2. One accompanying instrument is allowed.\n" +
            "\n" +
            "3. Karaoke or Backing track is strictly prohibited.\n" +
            "\n" +
            "4. All required instruments besides acoustic guitar and synthesizer have to be brought by the participants.\n" +
            "\n" +
            "5. Rap is not allowed.\n" +
            "\n" +
            "6. All song choices should be in english.\n" +
            "\n" +
            "JUDGING CRITERIA: Quality of singing, creativity, vocal range, clarity in lyrics and overall impact.";
    String r6="Balladeers (Western A Capella Competition)\n" +
            "\n" +
            "You're a note when you're alone, but a whole symphony when a group. Come, bring your harmonies to the stage and enthral everyone with your compositions.\n" +
            "\n" +
            "REGISTRATION:\n" +
            "\n" +
            "Participants can register both online and offline (on the spot).\n" +
            "\n" +
            "Registration link:.\n" +
            "\n" +
            "Please note: Only one person from a group should register.\n" +
            "\n" +
            "RULES:\n" +
            "\n" +
            "1. Each group is allotted a total of 12 minutes including sound check.\n" +
            "\n" +
            "2. The number of members in one group can range between 5-25.\n" +
            "\n" +
            "3. Use of instruments is not permitted at any time during the performance.\n" +
            "\n" +
            "4. Beat boxing is allowed.\n" +
            "\n" +
            "5. All song choices should be in english.\n" +
            "\n" +
            "JUDGING CRITERIA: Vocal dynamics, originality, creativity, coordination and overall impact.";
    String r7="Vrind (Indian Group Singing Competition)\n" +
            "\n" +
            "Come, sing and conquer our hearts, because if it is music you're all about and melody's your weapon, then we're all up for it.\n" +
            "\n" +
            "REGISTRATION:\n" +
            "\n" +
            "Participants must register for online prelims.\n" +
            "\n" +
            "Registration link:.\n" +
            "\n" +
            "Please note: Only one person from a group should register and only ONE entry from a college is permitted.\n" +
            "\n" +
            "\n" +
            "RULES:\n" +
            "\n" +
            "Prelims\n" +
            "1. Participants need to send an audio/video link of a performance by 26th January to madhurima.indian@gmail.com\n" +
            "\n" +
            "Finals\n" +
            "\n" +
            "1. Each group is allotted a total of 12 minutes including setup.\n" +
            "\n" +
            "2. The number of members in one group must be between 7 and 23, including accompanists.\n" +
            "\n" +
            "3. Maximum three accompanying instruments are allowed.\n" +
            "\n" +
            "4. A synthesizer and acoustic guitar will be provided. The participants must bring any other instruments required for their act.\n" +
            "\n" +
            "5. Beat boxing is allowed.\n" +
            "\n" +
            "6. Genre for the performance should be purely classical.\n" +
            "\n" +
            "JUDGING CRITERIA: Vocal dynamics, originality, creativity, coordination and overall impact.";
    String r9="Acoustic Alchemy (Instrumental Duet/Trio)\n" +
            "\n" +
            "REGISTRATION:\n" +
            "\n" +
            "Participants must send an audio/video link to a performance for online prelims to dtumusoc@gmail.com. Only selected teams can participate in the final event.\n" +
            "\n" +
            "Registration link:.\n" +
            "\n" +
            "Please note: Only one person from the team should register.\n" +
            "\n" +
            "RULES:\n" +
            "\n" +
            "1. Each shortlisted team is allotted a total of 6 minutes on stage including time for sound check.\n" +
            "2. Each group may consist of 2-3 members. \n" +
            "3. Programmed music shall not be allowed.  Only acoustic instruments may be used. (MIDI Keyboards playing a normal Piano VST is allowed)\n" +
            "4. All participants must bring their own instruments. However, a drum kit will be provided at the venue\n" +
            "\n" +
            "5. Beatboxing is allowed.\n" +
            "6. Performaces must be purely instrumental.\n" +
            "\n" +
            "JUDGING CRITERIA: Originality, creativity, coordination and overall impact.";
    String r8="";
    String r10="NUKKAD\n" +
            "\n" +
            "PRELIMS/ELIMINATIONS:\n" +
            "\n" +
            "All the participating teams must mail a short synopsis (50-100 words) of their scripts and the\n" +
            "script to pratibimb.dtu@gmail.com\n" +
            "15 teams will be shortlisted on basis of script, past performances (preference will be given to teams registering first)\n" +
            "\n" +
            "FINALS:\n" +
            "\n" +
            "Team size: No team limit\n" +
            "\n" +
            "Time limit: 20+1 minutes (empty stage to empty stage)\n" +
            "\n" +
            "Teams must perform the same street play which was mentioned in the script eliminations.\n\n" +
            "Judging Criteria:\n" +
            "Acting, Voice (sync, modulation, diction), Screenplay, Script, Crowd interaction and Overall impact.\n" +
            "\n" +
            "General Rules:\n" +
            "\n" +
            "1. The team size represents the number of people registered as a team. Only these shall be allowed to perform the street play.\n" +
            "\n2. Minimum of 8 actors are to be included in the team.\n" +
            "\n3. Music accompanists are included in the team number stated above.\n" +
            "\n" +
            "4. Teams are expected to perform at an open air venue, on a circular stage with audience all around.\n" +
            "\n" +
            "5. No electrical appliances shall be allowed during the performance, whether inside or outside the circle of performance.\n" +
            "\n" +
            "6. Only live music is allowed. Teams will have to bring their own instruments - no instrument shall be provided.\n" +
            "\n" +
            "7. Language of the performance should be Hindi/English or both. However short sub passages in other languages are allowed.\n" +
            "8. Any kind of fluid, live animals, flame, heavy object or any material which has a possibility of damaging the stage is not allowed.\n" +
            "\n" +
            "9. Dry colours may be used during the play, but the teams have to clean the stage after their performance and the cleaning time will be included in the performance time.\n" +
            "\n" +
            "10. Teams will be heavily penalised if they exceed the time limit.\n" +
            "\n" +
            "11. Plays can be based on any theme but since performance is being held at public venues, any content directed against a certain political group or religious community is strictly prohibited.\n" +
            "\n" +
            "\n12. Obscenity (at the discretion of judges) of any kind is not allowed and may lead to disqualification.\n" +
            "\n13. Any kind of plagiarism and profanity will lead to immediate disqualification.\n" +
            "\n14. The decision of the judges will be final.\n";
    String r11="NATYA\n" +
            "\n" +
            "PRELIMS/ELIMINATIONS:\n" +
            "\n" +
            "Team Size: 2-10 (+2 CAs compulsory\n" +
            "Eliminations:\n" +
            "\n" +
            "Registered teams will be called for eliminations. In case of large number of entries, teams will be selected for prelims on the basis of script and video.\n" +
            "\n" +
            "A summary of a play or a relevant part bringing out the essence of the play must be performed in Hindi/English or both, however, short sub-passages in other languages are allowed. The teams are required to submit a short synopsis (not more than 70 words) of the script of their play before the eliminations.\n" +
            "\n" +
            "Time Limit: 8-12 minutes (including the stage set up and clearance time)\n" +
            "\n" +
            "FINALS:\n" +
            "\n" +
            "Number of teams to be selected:-6-8\n" +
            "\n" +
            "Team Size: 2-10 (+2 CAs compulsory)\n" +
            "\n" +
            "The complete version of the same play should be performed.\n" +
            "TIME LIMIT: 35 - 50 minutes (including the stage set up and clearance time)\n" +
            "Production material provided:\n" +
            "4 chairs, 2 tables\n" +
            "\n" +
            "Any other production material has to be brought by the teams themselves but the organizers hold the discretion of allowing its inclusion on stage.\n" +
            "Judging Criteria:\n" +
            "Screenplay, Direction, Script, Acting and Overall Impact.\n" +
            "\n" +
            "General Rules:\n" +
            "\n" +
            "1. Performance should be in Hindi or English or both, however, short sub-passages in other languages are allowed.\n" +
            "2. Stage Play comprises of multiple scenes and may have blackouts.\n" +
            "3. Backstage voiceovers and narrations are allowed during the performance.\n" +
            "\n" +
            "4. Pre-recorded music is allowed and should be brought in a CD/DVD or a pen drive in .cda or .mp3 format only. (Other FORMATs may not be supported on the computer – use them at your own risk).\n" +
            "\n" +
            "5. If using pre-recorded sounds, teams are expected to being their own devices as well as appoint a person from within the team to operate the device. An aux cable shall be provided. \n" +
            "\n" +
            "6. Music may also be played live. However, no amplifiers or plug-points will be provided for this purpose.\n" +
            "\n" +
            "7. Participants will be provided a light control box, using which the lighting on the stage can be controlled. (Teams need to have a CA for this purpose within Team Size limit).\n" +
            "\n" +
            "8. Any kind of fluid, flame, live animals, heavy objects or any kind of material that damages the stage is strictly NOT allowed and may lead to disqualification.\n" +
            "\n" +
            "9. Obscenity (at the discretion of the judges) of any kind is NOT allowed and will lead to immediate disqualification.\n" +
            "\n" +
            "10. Inappropriate content, blasphemy or content defaming any political or religious group is strictly prohibited.\n" +
            "\n" +
            "11. Time limit should be strictly followed. Participants will be penalized by judges for not doing so. The time duration for prelims and finals includes performance time and stage setting time. The given time duration is from empty stage to empty stage.\n" +
            "\n" +
            "12. The decision of the judges will be final and binding.";
    String r12="It’s a new era in fashion- there are no rules. It’s all about reflecting who you are, what you feel at the moment, and where you’re going. Engifest’18 brings to you Paridhan- the perfect avenue to express yourself through fashion.\n" +
            "\nPARIDHAN\n" +
            "Registration has to be done ONLINE ONLY. There will be no on the spot registration. \n" +
            "\n" +
            "Paridhan’18 has two rounds- Online elimination and Stage round\n" +
            "\n" +
            "Online Elimination:\n" +
            "For the elimination round, teams have to mail the following at paridhandtu@gmail.com-\n" +
            "A soft copy of their designs for the stage round\n" +
            "Write ups explaining their designs for the stage round\n" +
            "The portfolio of any 4 models who would participate\n" +
            "The teams which qualify for the stage round have to include designs submitted for the online elimination round in their performance. Failure to do so will result in disqualification.\n" +
            "Last date for registration:\n" +
            "Last date for online submission:\n\n" +
            "Stage Round:\n" +
            "Selected teams have to perform on one of the following themes-\n" +
            "Elements of nature\n" +
            "Rebel with a cause\n" +
            "Tribal Fashion\n" +
            "Fantasy\n" +
            "Time limit: 7-10 minutes(including stage clearance)\n" +
            "No. of models: 10-16 models\n" +
            "\n" +
            "JUDGING CRITERIA\n" +
            "Designers: Depiction of theme, Designing, Creativity in use of props\n" +
            "Models: Ramp Walk, Stage Presence, Poise, Overall Appearance\n" +
            "Team: Choreography, Music Selection, Co-ordination\n" +
            "\n" +
            "RULES AND REGULATIONS\n" +
            "1. Paridhan is open only for college students\n" +
            "2. Only 1 team per college is allowed\n" +
            "3. All team members must carry with them valid college ID cards for the current year\n" +
            "4. Team size: 1-4 Designers, Choreographers and 1-3 makeup Artists(excluding the models)\n" +
            "5. Props need to be arranged by the teams on their own. Use of fire, water, animals or any other hazardous material is not allowed. In case of any confusion, please consult the organisers before using any such material\n" +
            "6. Vulgarity of any kind will lead to disqualification of the team from the event. It is strongly recommended to consult the organisers beforehand, in case the team feels any costume or stunt may be considered vulgar. The decision of the organisers will be final in case of an dispute arising due to this\n" +
            "7. Outside help is prohibited and any team caught will be disqualified\n" +
            "8. Teams are instructed to mail the soundtrack/music to be used to the organisers at least a week prior to the event (in mp3 format, at paridhandtu@gmail.com)\n" +
            "9. The decision of the judges will be final and binding on all\n";
    String r13="";
    String r14="";
    String r15="";
    String r16="";
    String r17="WAR OF WORDS\n" +
            "\n" +
            "If you think impeccable English and quick wit are your forte, then 'War of Words' is the appropriate arena for you. Conventional Debate, Turncoat, Group Discussion, JAM - you name it. War of words is going to put your intellect and your command over the lingua franca of the cosmos.\n" +
            "\n" +
            "RULES\n" +
            "\n" +
            "1.) The events will be divided into different rounds depending on the number of participants.\n" +
            "\n" +
            "2.) Format of the debate and exact rules will be declared on the date of the competition.";
    String r18="";
    String r19="";
    String r20="";
    String r21="";
    String r22="";
    String r23="SHOE PAINTING\n" +
            "Participants will be provided with a plain white shoe which they have to paint using\n" +
            "their creativity, according to the theme that will be given to them on the spot. Poster\n" +
            "colours/Acrylic colours will be provided as well.\n" +
            "\n" +
            "RULES-\n" +
            "1. Contestants will be provided with a White Shoe and Painting Equipments.\n" +
            "2. Time alloted for the competition is 3 hours only.\n" +
            "3. Topic will be given on the spot.\n" +
            "4. Contestants found with any unfair means or with layout reference during the\n" +
            "competition will be disqualified.\n" +
            "5. The judges result shall be final and binding.";
    String r24="ART &amp; FURIOUS\n" +
            "In this event, contestants will be required to present their best creation out of the\n" +
            "material provided to them. As we proceed with this competition, the challenges will\n" +
            "keep getting tougher. Tougher themes and even tougher time restrictions. A marathon\n" +
            "intended to test their creativity and imagination, with the completion of each stage, the\n" +
            "contestants will be filtered until we have our Last Man Standing.\n" +
            "\n" +
            "RULES-\n" +
            "1. There will be 3 Rounds in the competition stretched in a total time period of 3 hours.\n" +
            "\n" +
            "2. Required Materials will be provided.\n" +
            "3. Activities along with topics will be given on the spot for each round.\n" +
            "4. Contestants found with any unfair means or with layout reference during the\n" +
            "competition will be disqualified.\n" +
            "5. The judges result shall be final and binding.";
    String r25="3-D ART\n" +
            "Contestants are required to sculpt/design a model using the tools and the material\n" +
            "provided to them.\n" +
            "\n" +
            "RULES-\n" +
            "1. The Duration of competition is of 3 hours.\n" +
            "2. Required Materials will be provided.\n" +
            "3. Topics will be given on the spot.\n" +
            "4. Contestants found with any unfair means or with layout reference during the\n" +
            "competition will be disqualified.\n" +
            "5. The judges result shall be final and binding.";
    String r26="";
    String r27="";
    String r28="";
    String r29="";
    String r30="";
    String r31="";
    String r32="";
    String r33="";
    String r34="";
    String r35="";
    String r36="";





    HashMap<String,event_object> map;



    String str;



    TextView t1;
    TextView t2;
    TextView t3;
    TextView t4;
    TextView t5;
    ImageView i1;
    Button b1;












    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        map=new HashMap<>();




    makemap(map);

    set(arr[1]);








    }
    public void makemap(HashMap<String,event_object>map)
    {



        //dance

        map.put("spandan",new event_object(R.drawable.dance,"to be","to be","to be",s1,r1,2));

        map.put("anushtaan",new event_object(R.drawable.anu,"to be","to be","to be",s2,r2,2));

        map.put("switch the funk up",new event_object(R.drawable.dance2, "to be", "to be", "to be", s3, r3,2));


        //music


        map.put("engi-idol",new event_object(R.drawable.sing1,"to be","to be","to be",s4,r4,2));

        map.put("vocalicious",new event_object(R.drawable.sing2,"to be","to be","to be",s5,r5,2));

        map.put("balladeers",new event_object(R.drawable.sing3,"to be","to be","to be",s6,r6,2));

        map.put("vrind",new event_object(R.drawable.sing4,"to be","to be","to be",s7,r7,2));

        map.put("twos a show",new event_object(R.drawable.sing3,"to be","to be","to be",s8,r8,2));

        map.put("acoustic alchemy",new event_object(R.drawable.sing6,"to be","to be","to be",s9,r9,2));


        //drama
        map.put("nukkad",new event_object(R.drawable.drama1,"to be","to be","to be",s10,r10,2));

        map.put("natya",new event_object(R.drawable.drama1,"to be","to be","to be",s11,r11,2));


        //fashion
        map.put("paridhan",new event_object(R.drawable.fashion2,"to be","to be","to be",s12,r12,3));

        map.put("the selfie brag",new event_object(R.drawable.fashion2,"to be","to be","to be",s13,r13,2));


        //pro night

        map.put("live wire",new event_object(R.drawable.pro,"to be","to be","to be",s14,r14,2));

        map.put("edm",new event_object(R.drawable.edm,"to be","to be","to be",s15,r15,2));

        map.put("rock",new event_object(R.drawable.rock,"to be","to be","to be",s16,r16,2));


        //literray
        map.put("war of words",new event_object(R.drawable.literary1,"to be","to be","to be",s17,r17,2));

        map.put("creative writing",new event_object(R.drawable.literary2,"to be","to be","to be",s18,r18,2));

        map.put("mixed bag",new event_object(R.drawable.literary1,"to be","to be","to be",s19,r19,2));


        map.put("kavyaanjana",new event_object(R.drawable.literary2,"to be","to be","to be",s20,r20,2));

        map.put("jam",new event_object(R.drawable.literary1,"to be","to be","to be",s21,r21,2));

        map.put("drishtikon",new event_object(R.drawable.literary2,"to be","to be","to be",s22,r22,2));

        //art

        map.put("shoe",new event_object(R.drawable.art1,"to be","to be","to be",s23,r23,3));

        map.put("art and furious",new event_object(R.drawable.art2,"to be","to be","to be",s24,r24,2));

        map.put("3 dimensional art",new event_object(R.drawable.art3,"to be","to be","to be","",r25,2));



        //miscelenious

        map.put("film making",new event_object(R.drawable.movie,"to be","to be","to be","",r26,2));

        map.put("shakedown",new event_object(R.drawable.car,"to be","to be","to be","",r27,2));

        map.put("standup",new event_object(R.drawable.stand,"to be","to be","to be","",r28,3));
        map.put("kawi",new event_object(R.drawable.kavi,"to be","to be","to be","",r29,2));

        map.put("arte photographia",new event_object(R.drawable.photo,"to be","to be","to be","",r30,2));


        //informal

        map.put("poker",new event_object(R.drawable.pker,"to be","to be","to be","",r31,3));

        map.put("zorbing",new event_object(R.drawable.zorbing,"to be","to be","to be","",r32,2));

        map.put("cricket",new event_object(R.drawable.cricket,"to be","to be","to be","to be",r33,2));
        map.put("vr theatre",new event_object(R.drawable.vr,"to be","to be","to be","",r34,2));

        map.put("paintball",new event_object(R.drawable.paint,"to be","to be","to be","",r35,2));

        map.put("segway",new event_object(R.drawable.segway,"to be","to be","to be","",r36,2));






    }
    public void set(String s)
    {

        t1=(TextView)findViewById(R.id.heading);
        t2=(TextView)findViewById(R.id.date);
        t3=(TextView)findViewById(R.id.time);
        t4=(TextView)findViewById(R.id.venue);
        t5=(TextView)findViewById(R.id.r1);
        b1=(Button)findViewById(R.id.bb);
        i1=(ImageView)findViewById(R.id.image);

        t1.setText(s);
        t2.setText(map.get(s).date);
        t3.setText(map.get(s).time);
        t4.setText(map.get(s).venue);
        t5.setText(map.get(s).rules);


        i1.setScaleY(map.get(s).y);

        str=map.get(s).register;

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent link=new Intent(Intent.ACTION_VIEW, Uri.parse(str));
                startActivity(link);
            }
        });

        Picasso.with(this)
                .load(map.get(s).image)
                .resize(400,300)
                .into(i1);
    }





}
