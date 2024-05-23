package com.zing.zalo.p077ui.call.settingringtone.presenter.data;

import com.zing.zalo.p077ui.call.settingringtone.presenter.data.AbstractC11208a;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import n50.InterfaceC23567a;
import qn0.InterfaceC25392g;
import tn0.AbstractC26774a1;
import tn0.AbstractC26805k1;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class RingtoneData {
    public static final Companion Companion = new Companion(null);

    /* renamed from: a */
    private String f56350a;

    /* renamed from: b */
    private String f56351b;

    /* renamed from: c */
    private String f56352c;

    /* renamed from: d */
    private String f56353d;

    /* renamed from: e */
    private boolean f56354e;

    /* renamed from: f */
    private final int f56355f;

    /* renamed from: g */
    private final boolean f56356g;

    /* renamed from: h */
    private final boolean f56357h;

    /* renamed from: i */
    private boolean f56358i;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        public final KSerializer serializer() {
            return RingtoneData$$serializer.INSTANCE;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.data.RingtoneData$a */
    /* loaded from: classes5.dex */
    public static final class C11204a implements InterfaceC23567a {

        /* renamed from: a */
        private final RingtoneData f56359a;

        public C11204a(RingtoneData ringtoneData) {
            AbstractC19074t.m100208f(ringtoneData, "ringtoneData");
            this.f56359a = ringtoneData;
        }

        /* renamed from: a */
        public final RingtoneData m58741a() {
            return this.f56359a;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.data.RingtoneData$b */
    /* loaded from: classes5.dex */
    public static final class C11205b implements InterfaceC23567a {

        /* renamed from: a */
        private final RingtoneData f56360a;

        public C11205b(RingtoneData ringtoneData) {
            AbstractC19074t.m100208f(ringtoneData, "ringtoneData");
            this.f56360a = ringtoneData;
        }

        /* renamed from: a */
        public final RingtoneData m58742a() {
            return this.f56360a;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.data.RingtoneData$c */
    /* loaded from: classes5.dex */
    public static final class C11206c implements InterfaceC23567a {

        /* renamed from: a */
        private final RingtoneData f56361a;

        public C11206c(RingtoneData ringtoneData) {
            AbstractC19074t.m100208f(ringtoneData, "ringtoneData");
            this.f56361a = ringtoneData;
        }

        /* renamed from: a */
        public final RingtoneData m58743a() {
            return this.f56361a;
        }
    }

    /* renamed from: com.zing.zalo.ui.call.settingringtone.presenter.data.RingtoneData$d */
    /* loaded from: classes5.dex */
    public static final class C11207d implements InterfaceC23567a {

        /* renamed from: a */
        private final AbstractC11208a.b f56362a;

        public C11207d(AbstractC11208a.b bVar) {
            AbstractC19074t.m100208f(bVar, "ringtoneData");
            this.f56362a = bVar;
        }

        /* renamed from: a */
        public final AbstractC11208a.b m58744a() {
            return this.f56362a;
        }
    }

    public /* synthetic */ RingtoneData(int i11, String str, String str2, String str3, String str4, boolean z11, int i12, boolean z12, boolean z13, boolean z14, AbstractC26805k1 abstractC26805k1) {
        if (1 != (i11 & 1)) {
            AbstractC26774a1.m137800b(i11, 1, RingtoneData$$serializer.INSTANCE.getDescriptor());
        }
        this.f56350a = str;
        if ((i11 & 2) == 0) {
            this.f56351b = "";
        } else {
            this.f56351b = str2;
        }
        if ((i11 & 4) == 0) {
            this.f56352c = "";
        } else {
            this.f56352c = str3;
        }
        if ((i11 & 8) == 0) {
            this.f56353d = "";
        } else {
            this.f56353d = str4;
        }
        if ((i11 & 16) == 0) {
            this.f56354e = false;
        } else {
            this.f56354e = z11;
        }
        if ((i11 & 32) == 0) {
            this.f56355f = 0;
        } else {
            this.f56355f = i12;
        }
        if ((i11 & 64) == 0) {
            this.f56356g = false;
        } else {
            this.f56356g = z12;
        }
        if ((i11 & 128) == 0) {
            this.f56357h = false;
        } else {
            this.f56357h = z13;
        }
        if ((i11 & 256) == 0) {
            this.f56358i = false;
        } else {
            this.f56358i = z14;
        }
    }

    /* renamed from: m */
    public static final /* synthetic */ void m58729m(RingtoneData ringtoneData, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        interfaceC21886d.mo114035z(serialDescriptor, 0, ringtoneData.f56350a);
        if (interfaceC21886d.mo114019A(serialDescriptor, 1) || !AbstractC19074t.m100204b(ringtoneData.f56351b, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 1, ringtoneData.f56351b);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 2) || !AbstractC19074t.m100204b(ringtoneData.f56352c, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 2, ringtoneData.f56352c);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 3) || !AbstractC19074t.m100204b(ringtoneData.f56353d, "")) {
            interfaceC21886d.mo114035z(serialDescriptor, 3, ringtoneData.f56353d);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 4) || ringtoneData.f56354e) {
            interfaceC21886d.mo114034y(serialDescriptor, 4, ringtoneData.f56354e);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 5) || ringtoneData.f56355f != 0) {
            interfaceC21886d.mo114033x(serialDescriptor, 5, ringtoneData.f56355f);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 6) || ringtoneData.f56356g) {
            interfaceC21886d.mo114034y(serialDescriptor, 6, ringtoneData.f56356g);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 7) || ringtoneData.f56357h) {
            interfaceC21886d.mo114034y(serialDescriptor, 7, ringtoneData.f56357h);
        }
        if (interfaceC21886d.mo114019A(serialDescriptor, 8) || ringtoneData.f56358i) {
            interfaceC21886d.mo114034y(serialDescriptor, 8, ringtoneData.f56358i);
        }
    }

    /* renamed from: a */
    public final RingtoneData m58730a(String str, String str2, String str3, String str4, boolean z11, int i11, boolean z12, boolean z13, boolean z14) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "thumbURL");
        AbstractC19074t.m100208f(str3, "name");
        AbstractC19074t.m100208f(str4, "desc");
        return new RingtoneData(str, str2, str3, str4, z11, i11, z12, z13, z14);
    }

    /* renamed from: c */
    public final String m58731c() {
        return this.f56353d;
    }

    /* renamed from: d */
    public final String m58732d() {
        return this.f56350a;
    }

    /* renamed from: e */
    public final String m58733e() {
        return this.f56352c;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof RingtoneData) && AbstractC19074t.m100204b(((RingtoneData) obj).f56350a, this.f56350a)) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public final int m58734f() {
        return this.f56355f;
    }

    /* renamed from: g */
    public final String m58735g() {
        return this.f56351b;
    }

    /* renamed from: h */
    public final boolean m58736h() {
        return this.f56356g;
    }

    public int hashCode() {
        return super.hashCode();
    }

    /* renamed from: i */
    public final boolean m58737i() {
        return this.f56354e;
    }

    /* renamed from: j */
    public final boolean m58738j() {
        return this.f56358i;
    }

    /* renamed from: k */
    public final boolean m58739k() {
        return this.f56357h;
    }

    /* renamed from: l */
    public final void m58740l(boolean z11) {
        this.f56358i = z11;
    }

    public String toString() {
        return "RingtoneData(id=" + this.f56350a + ", thumbURL=" + this.f56351b + ", name=" + this.f56352c + ", desc=" + this.f56353d + ", isPlaying=" + this.f56354e + ", progress=" + this.f56355f + ", isLoading=" + this.f56356g + ", isSelecting=" + this.f56357h + ", isSelected=" + this.f56358i + ")";
    }

    public RingtoneData(String str, String str2, String str3, String str4, boolean z11, int i11, boolean z12, boolean z13, boolean z14) {
        AbstractC19074t.m100208f(str, "id");
        AbstractC19074t.m100208f(str2, "thumbURL");
        AbstractC19074t.m100208f(str3, "name");
        AbstractC19074t.m100208f(str4, "desc");
        this.f56350a = str;
        this.f56351b = str2;
        this.f56352c = str3;
        this.f56353d = str4;
        this.f56354e = z11;
        this.f56355f = i11;
        this.f56356g = z12;
        this.f56357h = z13;
        this.f56358i = z14;
    }

    public /* synthetic */ RingtoneData(String str, String str2, String str3, String str4, boolean z11, int i11, boolean z12, boolean z13, boolean z14, int i12, AbstractC19060k abstractC19060k) {
        this(str, (i12 & 2) != 0 ? "" : str2, (i12 & 4) != 0 ? "" : str3, (i12 & 8) == 0 ? str4 : "", (i12 & 16) != 0 ? false : z11, (i12 & 32) != 0 ? 0 : i11, (i12 & 64) != 0 ? false : z12, (i12 & 128) != 0 ? false : z13, (i12 & 256) == 0 ? z14 : false);
    }
}
