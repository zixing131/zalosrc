package com.zing.zalo.p077ui.picker.mediapicker;

import android.os.Bundle;
import com.zing.zalo.SensitiveData;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import m90.EnumC22962a;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.picker.mediapicker.b */
/* loaded from: classes6.dex */
public final class C12840b implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f66733a;

    /* renamed from: b */
    private final int f66734b;

    /* renamed from: c */
    private final String f66735c;

    /* renamed from: d */
    private final EnumC22962a f66736d;

    /* renamed from: e */
    private final boolean f66737e;

    /* renamed from: f */
    private final boolean f66738f;

    /* renamed from: g */
    private final boolean f66739g;

    /* renamed from: h */
    private final boolean f66740h;

    /* renamed from: i */
    private final boolean f66741i;

    /* renamed from: j */
    private final ArrayList f66742j;

    /* renamed from: k */
    private final SensitiveData f66743k;

    /* renamed from: com.zing.zalo.ui.picker.mediapicker.b$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12840b m72450a(Bundle bundle) {
            EnumC22962a enumC22962a = null;
            if (bundle == null) {
                return null;
            }
            int i11 = bundle.getInt("extraPhotoType", 15);
            int i12 = bundle.getInt("extraMaxSelectItems", 0);
            String string = bundle.getString("extraMessageReachLimit", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            Object obj = bundle.get("extraMediaPickerSource");
            if (obj instanceof EnumC22962a) {
                enumC22962a = (EnumC22962a) obj;
            }
            if (enumC22962a == null) {
                enumC22962a = EnumC22962a.f111693q;
            }
            boolean z11 = bundle.getBoolean("extraEnableInlineBanner", false);
            boolean z12 = bundle.getBoolean("extraOpenFromCamera", false);
            boolean z13 = bundle.getBoolean("extraIsShowFull", false);
            boolean z14 = bundle.getBoolean("extraSupportLiveCameraPicker", false);
            boolean z15 = bundle.getBoolean("extraIsCheckedHq", false);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("extraExternalSelectedItems");
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList();
            }
            return new C12840b(i11, i12, string, enumC22962a, z11, z12, z13, z14, z15, parcelableArrayList, (SensitiveData) bundle.getParcelable("EXTRA_SENSITIVE_DATA"));
        }
    }

    public C12840b(int i11, int i12, String str, EnumC22962a enumC22962a, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, ArrayList arrayList, SensitiveData sensitiveData) {
        AbstractC19074t.m100208f(str, "messageReachLimit");
        AbstractC19074t.m100208f(enumC22962a, "mediaPickerSource");
        AbstractC19074t.m100208f(arrayList, "externalSelectedItems");
        this.f66733a = i11;
        this.f66734b = i12;
        this.f66735c = str;
        this.f66736d = enumC22962a;
        this.f66737e = z11;
        this.f66738f = z12;
        this.f66739g = z13;
        this.f66740h = z14;
        this.f66741i = z15;
        this.f66742j = arrayList;
        this.f66743k = sensitiveData;
    }

    /* renamed from: a */
    public final boolean m72439a() {
        return this.f66737e;
    }

    /* renamed from: b */
    public final ArrayList m72440b() {
        return this.f66742j;
    }

    /* renamed from: c */
    public final int m72441c() {
        return this.f66734b;
    }

    /* renamed from: d */
    public final EnumC22962a m72442d() {
        return this.f66736d;
    }

    /* renamed from: e */
    public final String m72443e() {
        return this.f66735c;
    }

    /* renamed from: f */
    public final int m72444f() {
        return this.f66733a;
    }

    /* renamed from: g */
    public final SensitiveData m72445g() {
        return this.f66743k;
    }

    /* renamed from: h */
    public final boolean m72446h() {
        return this.f66741i;
    }

    /* renamed from: i */
    public final boolean m72447i() {
        return this.f66738f;
    }

    /* renamed from: j */
    public final boolean m72448j() {
        return this.f66739g;
    }

    /* renamed from: k */
    public final boolean m72449k() {
        return this.f66740h;
    }
}
