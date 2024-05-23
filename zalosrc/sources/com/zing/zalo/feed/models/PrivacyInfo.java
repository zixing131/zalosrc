package com.zing.zalo.feed.models;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import bi0.AbstractC2810d;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.MainApplication;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.social.controls.LikeContactItem;
import ho0.AbstractC20110a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import me0.AbstractC23136l9;
import mj0.AbstractC23322a;
import org.json.JSONArray;
import org.json.JSONObject;
import p304ks.AbstractC21935u;
import p304ks.C21927m;
import p348mi.AbstractC23309i;
import vg.C28203u6;

/* loaded from: classes4.dex */
public class PrivacyInfo implements Parcelable {
    public static final Parcelable.Creator<PrivacyInfo> CREATOR = new C8467a();

    /* renamed from: u */
    public static List f45971u;

    /* renamed from: v */
    public static PrivacyInfo f45972v;

    /* renamed from: p */
    public int f45973p;

    /* renamed from: q */
    public ArrayList f45974q;

    /* renamed from: r */
    public String f45975r;

    /* renamed from: s */
    public String f45976s;

    /* renamed from: t */
    public int f45977t;

    /* renamed from: com.zing.zalo.feed.models.PrivacyInfo$a */
    /* loaded from: classes4.dex */
    class C8467a implements Parcelable.Creator {
        C8467a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public PrivacyInfo createFromParcel(Parcel parcel) {
            return new PrivacyInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public PrivacyInfo[] newArray(int i11) {
            return new PrivacyInfo[i11];
        }
    }

    public PrivacyInfo() {
        this.f45973p = 0;
        this.f45974q = new ArrayList();
        this.f45975r = "";
        this.f45976s = "";
        this.f45977t = 40;
    }

    /* renamed from: B */
    public static synchronized void m45121B(boolean z11) {
        synchronized (PrivacyInfo.class) {
            try {
                try {
                    if (f45971u == null || z11) {
                        f45971u = new ArrayList();
                        String m122202na = AbstractC23309i.m122202na();
                        if (!TextUtils.isEmpty(m122202na)) {
                            JSONArray jSONArray = new JSONArray(m122202na);
                            for (int i11 = 0; i11 < jSONArray.length(); i11++) {
                                JSONObject jSONObject = (JSONObject) jSONArray.get(i11);
                                int i12 = jSONObject.getInt("menu_id");
                                ArrayList m45122C = m45122C(jSONObject.getJSONArray("list"));
                                ArrayList arrayList = new ArrayList();
                                Iterator it = m45122C.iterator();
                                while (it.hasNext()) {
                                    LikeContactItem likeContactItem = (LikeContactItem) it.next();
                                    if (z11) {
                                        ContactProfile m141809c = C28203u6.f131407a.m141809c(likeContactItem.m56333d());
                                        arrayList.add(new LikeContactItem(m141809c.f42434r, m141809c.m40383Q(true, false), m141809c.f42446v));
                                    } else {
                                        arrayList.add(likeContactItem);
                                    }
                                }
                                if (arrayList.size() > 0) {
                                    f45971u.add(new PrivacyInfo(2, arrayList, i12));
                                }
                            }
                        }
                        if (z11) {
                            m45124F();
                        }
                    }
                    m45126J();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: C */
    public static ArrayList m45122C(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < jSONArray.length(); i11++) {
            try {
                JSONObject jSONObject = (JSONObject) jSONArray.get(i11);
                arrayList.add(new LikeContactItem(jSONObject.getString("uid"), jSONObject.getString("dpn"), jSONObject.getString("avt")));
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return arrayList;
    }

    /* renamed from: D */
    public static JSONObject m45123D() {
        JSONObject jSONObject = new JSONObject();
        try {
            PrivacyInfo privacyInfo = f45972v;
            if (privacyInfo != null) {
                jSONObject.put("list", m45132d(privacyInfo.f45974q));
                AbstractC23309i.m121958gv(jSONObject.toString());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONObject;
    }

    /* renamed from: F */
    public static JSONArray m45124F() {
        JSONArray jSONArray = new JSONArray();
        try {
            List<PrivacyInfo> list = f45971u;
            if (list != null) {
                for (PrivacyInfo privacyInfo : list) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("menu_id", privacyInfo.f45977t);
                    jSONObject.put("list", m45132d(privacyInfo.f45974q));
                    jSONArray.put(jSONObject);
                }
                AbstractC23309i.m121996hv(jSONArray.toString());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONArray;
    }

    /* renamed from: I */
    public static synchronized void m45125I() {
        synchronized (PrivacyInfo.class) {
            try {
                try {
                    PrivacyInfo privacyInfo = f45972v;
                    if (privacyInfo != null) {
                        ArrayList<LikeContactItem> arrayList = privacyInfo.f45974q;
                        boolean z11 = false;
                        for (LikeContactItem likeContactItem : arrayList) {
                            boolean m153137g = C21927m.m114302u().m114312J().m153137g(likeContactItem.m56333d());
                            boolean m114558y = AbstractC21935u.m114558y(likeContactItem.m56333d());
                            if (m153137g || !m114558y) {
                                arrayList.remove(likeContactItem);
                                z11 = true;
                            }
                        }
                        if (z11) {
                            m45123D();
                        }
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: J */
    private static synchronized void m45126J() {
        List<PrivacyInfo> list;
        ArrayList arrayList;
        ArrayList<LikeContactItem> arrayList2;
        synchronized (PrivacyInfo.class) {
            try {
                try {
                    list = f45971u;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (list == null) {
                    return;
                }
                boolean z11 = false;
                for (PrivacyInfo privacyInfo : list) {
                    if (privacyInfo != null && (arrayList2 = privacyInfo.f45974q) != null) {
                        for (LikeContactItem likeContactItem : arrayList2) {
                            boolean m153137g = C21927m.m114302u().m114312J().m153137g(likeContactItem.m56333d());
                            boolean m114558y = AbstractC21935u.m114558y(likeContactItem.m56333d());
                            if (m153137g || !m114558y) {
                                arrayList2.remove(likeContactItem);
                                z11 = true;
                            }
                        }
                    }
                }
                for (PrivacyInfo privacyInfo2 : f45971u) {
                    if (privacyInfo2 == null || (arrayList = privacyInfo2.f45974q) == null || arrayList.isEmpty()) {
                        f45971u.remove(privacyInfo2);
                        z11 = true;
                    }
                }
                if (z11) {
                    m45124F();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: K */
    public static void m45127K(List list) {
        if (list == null) {
            return;
        }
        try {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                if (inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r)) {
                    arrayList.add(new LikeContactItem(inviteContactProfile.f42434r, inviteContactProfile.m40383Q(true, false), inviteContactProfile.f42446v));
                }
            }
            f45972v = new PrivacyInfo(3, arrayList, 90);
            m45123D();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: M */
    public static void m45128M(int i11, List list) {
        try {
            if (f45971u != null) {
                int i12 = 0;
                while (true) {
                    if (i12 >= f45971u.size()) {
                        break;
                    }
                    if (((PrivacyInfo) f45971u.get(i12)).f45977t == i11) {
                        f45971u.remove(i12);
                        break;
                    }
                    i12++;
                }
                if (!list.isEmpty()) {
                    ArrayList arrayList = new ArrayList();
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                        if (inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r)) {
                            arrayList.add(new LikeContactItem(inviteContactProfile.f42434r, inviteContactProfile.m40383Q(true, false), inviteContactProfile.f42446v));
                        }
                    }
                    PrivacyInfo privacyInfo = new PrivacyInfo(2, arrayList, i11);
                    privacyInfo.m45139f();
                    f45971u.add(0, privacyInfo);
                    while (f45971u.size() > 2) {
                        List list2 = f45971u;
                        list2.remove(list2.size() - 1);
                    }
                }
                m45124F();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public static int m45129a(List list) {
        int i11 = -1;
        try {
            if (f45971u != null) {
                ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                    if (inviteContactProfile != null && !TextUtils.isEmpty(inviteContactProfile.f42434r)) {
                        arrayList.add(new LikeContactItem(inviteContactProfile.f42434r, inviteContactProfile.m40383Q(true, false), inviteContactProfile.f42446v));
                    }
                }
                i11 = new Random().nextInt(1000) + 1000;
                PrivacyInfo privacyInfo = new PrivacyInfo(2, arrayList, i11);
                privacyInfo.m45139f();
                f45971u.add(0, privacyInfo);
                while (f45971u.size() > 2) {
                    List list2 = f45971u;
                    list2.remove(list2.size() - 1);
                }
                m45124F();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return i11;
    }

    /* renamed from: b */
    public static void m45130b() {
        f45972v = null;
    }

    /* renamed from: c */
    public static void m45131c() {
        f45971u = null;
    }

    /* renamed from: d */
    public static JSONArray m45132d(ArrayList arrayList) {
        JSONArray jSONArray = new JSONArray();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                LikeContactItem likeContactItem = (LikeContactItem) it.next();
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("uid", likeContactItem.m56333d());
                jSONObject.put("dpn", likeContactItem.m56331b());
                jSONObject.put("avt", likeContactItem.m56330a());
                jSONArray.put(jSONObject);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return jSONArray;
    }

    /* renamed from: i */
    public static PrivacyInfo m45133i() {
        PrivacyInfo privacyInfo = new PrivacyInfo();
        try {
            PrivacyInfo privacyInfo2 = f45972v;
            if (privacyInfo2 != null) {
                privacyInfo.f45973p = 3;
                privacyInfo.f45977t = 90;
                privacyInfo.f45974q = privacyInfo2.f45974q;
                privacyInfo.f45975r = privacyInfo2.f45975r;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return privacyInfo;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:            r0.f45973p = 2;        r0.f45977t = r2.f45977t;        r0.f45974q = r2.f45974q;        r0.f45975r = r2.f45975r;     */
    /* renamed from: q */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static PrivacyInfo m45134q(int i11) {
        PrivacyInfo privacyInfo = new PrivacyInfo();
        try {
            List list = f45971u;
            if (list != null) {
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    PrivacyInfo privacyInfo2 = (PrivacyInfo) it.next();
                    if (privacyInfo2.f45977t == i11 && privacyInfo2.f45974q.size() > 0) {
                        break;
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        return privacyInfo;
    }

    /* renamed from: z */
    public static synchronized void m45135z(boolean z11) {
        synchronized (PrivacyInfo.class) {
            try {
                try {
                    if (f45972v == null || z11) {
                        String m122164ma = AbstractC23309i.m122164ma();
                        if (!TextUtils.isEmpty(m122164ma)) {
                            ArrayList m45122C = m45122C(new JSONObject(m122164ma).getJSONArray("list"));
                            ArrayList arrayList = new ArrayList();
                            Iterator it = m45122C.iterator();
                            while (it.hasNext()) {
                                LikeContactItem likeContactItem = (LikeContactItem) it.next();
                                if (z11) {
                                    ContactProfile m141809c = C28203u6.f131407a.m141809c(likeContactItem.m56333d());
                                    arrayList.add(new LikeContactItem(m141809c.f42434r, m141809c.m40383Q(true, false), m141809c.f42446v));
                                } else {
                                    arrayList.add(likeContactItem);
                                }
                            }
                            f45972v = new PrivacyInfo(3, arrayList, 90);
                        } else {
                            f45972v = new PrivacyInfo(3, new ArrayList(), 90);
                        }
                        if (z11) {
                            m45123D();
                        }
                    }
                    m45125I();
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* renamed from: H */
    public void m45136H(ArrayList arrayList) {
        this.f45974q = arrayList;
        if (!arrayList.isEmpty()) {
            m45139f();
            m45140g();
        }
    }

    /* renamed from: N */
    public void m45137N() {
        try {
            int i11 = this.f45973p;
            if (i11 != 0) {
                if (i11 != 1) {
                    if (i11 != 2) {
                        if (i11 == 3) {
                            this.f45977t = 90;
                        }
                    } else {
                        this.f45977t = 1000;
                    }
                } else {
                    this.f45977t = 50;
                }
            } else {
                this.f45977t = 40;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public List m45138e() {
        ArrayList arrayList = new ArrayList();
        try {
            ArrayList arrayList2 = this.f45974q;
            if (arrayList2 != null) {
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    LikeContactItem likeContactItem = (LikeContactItem) it.next();
                    arrayList.add(new InviteContactProfile(likeContactItem.m56333d(), likeContactItem.m56330a(), likeContactItem.m56331b()));
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
        return arrayList;
    }

    /* renamed from: f */
    public void m45139f() {
        String string;
        try {
            int i11 = this.f45973p;
            if (i11 == 2) {
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = this.f45974q;
                if (arrayList != null && arrayList.size() > 0) {
                    Iterator it = this.f45974q.iterator();
                    boolean z11 = true;
                    int i12 = 0;
                    while (it.hasNext()) {
                        LikeContactItem likeContactItem = (LikeContactItem) it.next();
                        if (z11) {
                            z11 = false;
                        } else {
                            sb2.append(", ");
                        }
                        String m56331b = likeContactItem.m56331b();
                        if (m56331b.length() > 30) {
                            m56331b = m56331b.substring(0, 27) + "...";
                        }
                        sb2.append(m56331b);
                        i12++;
                        if (i12 == 2) {
                            break;
                        }
                    }
                    int size = this.f45974q.size() - i12;
                    if (size > 0 && i12 > 0) {
                        sb2.append(" ");
                        sb2.append(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_status_tag_others_text), Integer.valueOf(size)));
                    }
                    if (size > 0) {
                        this.f45975r = MainApplication.getAppContext().getString(AbstractC8020f0.str_privacy_include) + " " + sb2.toString();
                        return;
                    }
                    this.f45975r = sb2.toString();
                    return;
                }
                return;
            }
            if (i11 == 3) {
                ArrayList arrayList2 = this.f45974q;
                if (arrayList2 != null && arrayList2.size() > 0) {
                    if (this.f45974q.size() == 1) {
                        string = MainApplication.getAppContext().getString(AbstractC8020f0.str_privacy_except_one_friend_hint);
                    } else {
                        string = String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_privacy_except_friends_hint), Integer.valueOf(this.f45974q.size()));
                    }
                } else {
                    string = MainApplication.getAppContext().getString(AbstractC8020f0.str_privacy_except_friends_hint_default);
                }
                this.f45975r = string;
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: g */
    public void m45140g() {
        try {
            int i11 = this.f45973p;
            if (i11 == 2 || i11 == 3) {
                StringBuilder sb2 = new StringBuilder();
                ArrayList arrayList = this.f45974q;
                if (arrayList != null && arrayList.size() > 0) {
                    Iterator it = this.f45974q.iterator();
                    boolean z11 = true;
                    int i12 = 0;
                    while (it.hasNext()) {
                        LikeContactItem likeContactItem = (LikeContactItem) it.next();
                        if (z11) {
                            z11 = false;
                        } else {
                            sb2.append(", ");
                        }
                        String m56331b = likeContactItem.m56331b();
                        if (m56331b.length() > 30) {
                            m56331b = m56331b.substring(0, 27) + "...";
                        }
                        sb2.append(m56331b);
                        i12++;
                        if (i12 == 2) {
                            break;
                        }
                    }
                    int size = this.f45974q.size() - i12;
                    if (size > 0 && i12 > 0) {
                        sb2.append(" ");
                        sb2.append(String.format(MainApplication.getAppContext().getString(AbstractC8020f0.str_status_tag_others_text), Integer.valueOf(size)));
                    }
                    this.f45976s = sb2.toString();
                }
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: h */
    public String m45141h() {
        int i11 = this.f45973p;
        if (i11 != 2) {
            if (i11 != 3) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_share_all_desc);
            }
            ArrayList arrayList = this.f45974q;
            if (arrayList != null && !arrayList.isEmpty()) {
                return this.f45976s;
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_share_exclude_desc);
        }
        ArrayList arrayList2 = this.f45974q;
        if (arrayList2 != null && !arrayList2.isEmpty()) {
            return this.f45976s;
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_share_select_desc);
    }

    /* renamed from: j */
    public int m45142j() {
        int i11 = this.f45973p;
        return i11 != 0 ? i11 != 1 ? i11 != 3 ? AbstractC16803z.timeline_icon_privacyfriend : AbstractC16803z.timeline_icon_except : AbstractC16803z.timeline_icon_privacy : AbstractC16803z.timeline_icon_friends;
    }

    /* renamed from: k */
    public int m45143k() {
        int i11 = this.f45973p;
        return i11 != 0 ? i11 != 1 ? i11 != 3 ? AbstractC16803z.ic_privacy_selected : AbstractC16803z.ic_privacy_except : AbstractC16803z.ic_privacy_only_me : AbstractC16803z.ic_privacy_friends;
    }

    /* renamed from: l */
    public int m45144l() {
        int i11 = this.f45973p;
        return i11 != 0 ? i11 != 1 ? i11 != 3 ? AbstractC16803z.ic_social_album_selective : AbstractC16803z.ic_social_album_restricted : AbstractC16803z.ic_social_album_private : AbstractC16803z.ic_social_album_public;
    }

    /* renamed from: m */
    public int m45145m() {
        int i11 = this.f45973p;
        return i11 != 2 ? i11 != 3 ? AbstractC16803z.ic_story_privacy_all_friends : AbstractC16803z.ic_story_privacy_exclude : AbstractC16803z.ic_story_privacy_select_friends;
    }

    /* renamed from: n */
    public int m45146n() {
        int i11 = this.f45973p;
        return i11 != 2 ? i11 != 3 ? AbstractC16803z.ic_story_privacy_black_line_all : AbstractC16803z.ic_story_privacy_black_line_except_friends : AbstractC16803z.ic_story_privacy_black_line_select_friends;
    }

    /* renamed from: o */
    public int m45147o() {
        int i11 = this.f45973p;
        return i11 != 2 ? i11 != 3 ? AbstractC23322a.zds_ic_members_solid_24 : AbstractC23322a.zds_ic_user_block_solid_24 : AbstractC23322a.zds_ic_user_check_solid_24;
    }

    /* renamed from: p */
    public int m45148p(Boolean bool) {
        int i11 = this.f45973p;
        if (i11 != 2) {
            if (i11 != 3) {
                if (bool.booleanValue()) {
                    return AbstractC2810d.zds_ic_members_solid_32;
                }
                return AbstractC16803z.ic_story_privacy_white_line_all;
            }
            if (bool.booleanValue()) {
                return AbstractC2810d.zds_ic_user_block_solid_32;
            }
            return AbstractC16803z.ic_story_privacy_white_line_except_friends;
        }
        if (bool.booleanValue()) {
            return AbstractC2810d.zds_ic_user_check_solid_32;
        }
        return AbstractC16803z.ic_story_privacy_white_line_select_friends;
    }

    /* renamed from: t */
    public String m45149t() {
        int i11 = this.f45973p;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 3) {
                    return AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_list_in_feed);
                }
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_except_friends_do_not_count);
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_only_me_title);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_privacy_share_all_title);
    }

    /* renamed from: u */
    public String m45150u() {
        int i11 = this.f45973p;
        if (i11 != 2) {
            if (i11 != 3) {
                return AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_share_all);
            }
            return AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_share_exclude);
        }
        return AbstractC23136l9.m118743r0(AbstractC8020f0.str_story_privacy_share_select);
    }

    /* renamed from: w */
    public boolean m45151w() {
        ArrayList arrayList = this.f45974q;
        if (arrayList != null && !arrayList.isEmpty()) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        try {
            parcel.writeInt(this.f45973p);
            parcel.writeList(this.f45974q);
            parcel.writeString(this.f45975r);
            parcel.writeString(this.f45976s);
            parcel.writeInt(this.f45977t);
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    /* renamed from: x */
    public boolean m45152x() {
        return this.f45973p != 0;
    }

    /* renamed from: y */
    public boolean m45153y() {
        try {
            int i11 = this.f45973p;
            if (i11 != 2 && i11 != 3) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    public PrivacyInfo(PrivacyInfo privacyInfo) {
        if (privacyInfo != null) {
            this.f45973p = privacyInfo.f45973p;
            if (privacyInfo.f45974q != null) {
                this.f45974q = new ArrayList(privacyInfo.f45974q);
            }
            this.f45977t = privacyInfo.f45977t;
            this.f45975r = privacyInfo.f45975r;
            this.f45976s = privacyInfo.f45976s;
        }
    }

    public PrivacyInfo(int i11, ArrayList arrayList, int i12) {
        this.f45973p = i11;
        this.f45974q = arrayList == null ? new ArrayList() : arrayList;
        this.f45977t = i12;
        m45139f();
    }

    public PrivacyInfo(int i11) {
        this.f45973p = i11;
        this.f45974q = new ArrayList();
    }

    public PrivacyInfo(Parcel parcel) {
        try {
            this.f45973p = parcel.readInt();
            if (this.f45974q == null) {
                this.f45974q = new ArrayList();
            }
            parcel.readList(this.f45974q, LikeContactItem.class.getClassLoader());
            this.f45975r = parcel.readString();
            this.f45976s = parcel.readString();
            this.f45977t = parcel.readInt();
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }
}
