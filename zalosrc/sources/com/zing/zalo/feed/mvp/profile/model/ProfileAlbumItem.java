package com.zing.zalo.feed.mvp.profile.model;

import android.os.Parcel;
import android.os.Parcelable;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import is.AbstractC20783a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p716zh.AbstractC32173x4;
import p716zh.C32187y4;
import qm0.AbstractC25332a0;

/* loaded from: classes4.dex */
public final class ProfileAlbumItem implements Parcelable {

    /* renamed from: p */
    private ProfileAlbumHeader f46702p;

    /* renamed from: q */
    private List f46703q;
    public static final C8665b Companion = new C8665b(null);
    public static final Parcelable.Creator<ProfileAlbumItem> CREATOR = new C8666c();

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem$a */
    /* loaded from: classes4.dex */
    public static final class C8664a extends AbstractC32173x4 {
        C8664a(JSONObject jSONObject) {
            super(jSONObject);
        }

        @Override // p716zh.AbstractC32173x4
        /* renamed from: d */
        public boolean mo46310d(C32187y4 c32187y4) {
            AbstractC19074t.m100208f(c32187y4, "item");
            Iterator it = m155151j().iterator();
            while (it.hasNext()) {
                if (((C32187y4) it.next()).m155183k() == c32187y4.m155183k()) {
                    return true;
                }
            }
            return false;
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem$b */
    /* loaded from: classes4.dex */
    public static final class C8665b {
        private C8665b() {
        }

        public /* synthetic */ C8665b(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem$c */
    /* loaded from: classes4.dex */
    public static final class C8666c implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final ProfileAlbumItem createFromParcel(Parcel parcel) {
            AbstractC19074t.m100208f(parcel, "parcel");
            return new ProfileAlbumItem(ProfileAlbumHeader.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ProfileAlbumItem[] newArray(int i11) {
            return new ProfileAlbumItem[i11];
        }
    }

    public ProfileAlbumItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* renamed from: b */
    private final void m46298b(AbstractC32173x4 abstractC32173x4) {
        Object m131205e0;
        try {
            List list = this.f46703q;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((AbstractC32173x4) obj).m155147f() == abstractC32173x4.m155147f()) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                m131205e0 = AbstractC25332a0.m131205e0(arrayList);
                AbstractC32173x4 abstractC32173x42 = (AbstractC32173x4) m131205e0;
                int m155149h = abstractC32173x42.m155149h() + 1;
                int size = abstractC32173x4.m155151j().size();
                for (int i11 = 0; i11 < size; i11++) {
                    C32187y4.b m155176d = ((C32187y4) abstractC32173x4.m155151j().get(i11)).m155176d();
                    if (m155176d != null) {
                        m155176d.m155198g(m155176d.m155193b() + m155149h);
                    }
                }
                abstractC32173x42.m155145c(abstractC32173x4.m155151j());
                return;
            }
            this.f46703q.add(abstractC32173x4);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a */
    public final void m46299a(ProfileAlbumItem profileAlbumItem) {
        AbstractC19074t.m100208f(profileAlbumItem, "albumItem");
        Iterator it = profileAlbumItem.f46703q.iterator();
        while (it.hasNext()) {
            m46298b((AbstractC32173x4) it.next());
        }
    }

    /* renamed from: c */
    public final ProfileAlbumHeader m46300c() {
        return this.f46702p;
    }

    /* renamed from: d */
    public final List m46301d() {
        return this.f46703q;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public final String m46302e() {
        AbstractC20783a.a aVar = AbstractC20783a.Companion;
        String m108432a = aVar.m108432a(this.f46702p.m46281i());
        String m108433b = aVar.m108433b(this.f46702p.m46289q());
        if (!m46309l()) {
            if (this.f46702p.m46289q() > 0 && this.f46702p.m46281i() > 0) {
                return m108432a + ", " + m108433b;
            }
            if (this.f46702p.m46289q() <= 0 || this.f46702p.m46281i() != 0) {
                return m108432a;
            }
        }
        return m108433b;
    }

    /* renamed from: f */
    public final boolean m46303f() {
        return this.f46703q.isEmpty();
    }

    /* renamed from: g */
    public final boolean m46304g() {
        if (this.f46702p.m46288p() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final boolean m46305h() {
        if (this.f46702p.m46288p() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean m46306i() {
        if (this.f46702p.m46288p() == 4) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final boolean m46307j() {
        if (this.f46702p.m46288p() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public final boolean m46308k() {
        if (this.f46702p.m46288p() == 5) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public final boolean m46309l() {
        if (this.f46702p.m46288p() == 2) {
            return true;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        AbstractC19074t.m100208f(parcel, "out");
        this.f46702p.writeToParcel(parcel, i11);
    }

    public ProfileAlbumItem(ProfileAlbumHeader profileAlbumHeader) {
        AbstractC19074t.m100208f(profileAlbumHeader, "header");
        this.f46702p = profileAlbumHeader;
        this.f46703q = new ArrayList();
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getPhiList()" because "resultVar" is null
        	at jadx.core.dex.visitors.InitCodeVariables.collectConnectedVars(InitCodeVariables.java:119)
        	at jadx.core.dex.visitors.InitCodeVariables.setCodeVar(InitCodeVariables.java:82)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVar(InitCodeVariables.java:74)
        	at jadx.core.dex.visitors.InitCodeVariables.initCodeVars(InitCodeVariables.java:48)
        	at jadx.core.dex.visitors.InitCodeVariables.visit(InitCodeVariables.java:29)
        */
    public /* synthetic */ ProfileAlbumItem(com.zing.zalo.feed.mvp.profile.model.ProfileAlbumHeader r26, int r27, fn0.AbstractC19060k r28) {
        /*
            r25 = this;
            r0 = r27 & 1
            if (r0 == 0) goto L2e
            com.zing.zalo.feed.mvp.profile.model.ProfileAlbumHeader r0 = new com.zing.zalo.feed.mvp.profile.model.ProfileAlbumHeader
            r1 = r0
            r2 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 262143(0x3ffff, float:3.6734E-40)
            r24 = 0
            r1.<init>(r2, r4, r5, r6, r7, r8, r9, r11, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
            r1 = r25
            goto L32
        L2e:
            r1 = r25
            r0 = r26
        L32:
            r1.<init>(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zing.zalo.feed.mvp.profile.model.ProfileAlbumItem.<init>(com.zing.zalo.feed.mvp.profile.model.ProfileAlbumHeader, int, fn0.k):void");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ProfileAlbumItem(JSONObject jSONObject) {
        this(null, 1, 0 == true ? 1 : 0);
        AbstractC19074t.m100208f(jSONObject, "json");
        try {
            if (jSONObject.has("header")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("header");
                AbstractC19074t.m100207e(jSONObject2, "getJSONObject(...)");
                this.f46702p = new ProfileAlbumHeader(jSONObject2);
            }
            JSONArray optJSONArray = jSONObject.optJSONArray("layoutList");
            if (optJSONArray != null) {
                int length = optJSONArray.length();
                for (int i11 = 0; i11 < length; i11++) {
                    JSONObject optJSONObject = optJSONArray.optJSONObject(i11);
                    if (optJSONObject != null) {
                        m46298b(new C8664a(optJSONObject));
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
