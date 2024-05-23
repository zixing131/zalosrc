package com.zing.zalo.p077ui.picker.gallerypicker;

import android.os.Bundle;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import m90.EnumC22962a;
import p205hc.InterfaceC19969h;

/* renamed from: com.zing.zalo.ui.picker.gallerypicker.a */
/* loaded from: classes6.dex */
public final class C12695a implements InterfaceC19969h {
    public static final a Companion = new a(null);

    /* renamed from: a */
    private final int f66086a;

    /* renamed from: b */
    private final long f66087b;

    /* renamed from: c */
    private final String f66088c;

    /* renamed from: d */
    private final int f66089d;

    /* renamed from: e */
    private final int f66090e;

    /* renamed from: f */
    private final String f66091f;

    /* renamed from: g */
    private final ArrayList f66092g;

    /* renamed from: h */
    private final boolean f66093h;

    /* renamed from: i */
    private final EnumC22962a f66094i;

    /* renamed from: j */
    private final boolean f66095j;

    /* renamed from: k */
    private final boolean f66096k;

    /* renamed from: l */
    private final boolean f66097l;

    /* renamed from: m */
    private final String f66098m;

    /* renamed from: n */
    private final boolean f66099n;

    /* renamed from: o */
    private final boolean f66100o;

    /* renamed from: com.zing.zalo.ui.picker.gallerypicker.a$a */
    /* loaded from: classes6.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final C12695a m71511a(Bundle bundle) {
            if (bundle == null) {
                return null;
            }
            int i11 = bundle.getInt("extra_album_action", -1);
            long j11 = bundle.getLong("extra_album_id", -1L);
            String string = bundle.getString("extra_album_name", "");
            AbstractC19074t.m100207e(string, "getString(...)");
            int i12 = bundle.getInt("extra_photo_type", -1);
            int i13 = bundle.getInt("extra_max_selected_items", 0);
            String string2 = bundle.getString("extra_message_reach_limit", "");
            AbstractC19074t.m100207e(string2, "getString(...)");
            ArrayList parcelableArrayList = bundle.getParcelableArrayList("extra_external_selected_items");
            if (parcelableArrayList == null) {
                parcelableArrayList = new ArrayList();
            }
            ArrayList arrayList = parcelableArrayList;
            boolean z11 = bundle.getBoolean("extra_open_from_camera", false);
            EnumC22962a enumC22962a = (EnumC22962a) bundle.get("extra_media_picker_source");
            if (enumC22962a == null) {
                enumC22962a = EnumC22962a.f111694r;
            }
            EnumC22962a enumC22962a2 = enumC22962a;
            boolean z12 = bundle.getBoolean("extra_send_from_action_list_media_picker", false);
            boolean z13 = bundle.getBoolean("extra_enable_inline_banner", false);
            boolean z14 = bundle.getBoolean("extra_action_pick_media_edit_view_enable", false);
            String string3 = bundle.getString("extra_action_pick_media_edit_view_aspect_ratio", "");
            AbstractC19074t.m100207e(string3, "getString(...)");
            return new C12695a(i11, j11, string, i12, i13, string2, arrayList, z11, enumC22962a2, z12, z13, z14, string3, bundle.getBoolean("extra_is_enable_external_selected_items", false), bundle.getBoolean("extra_open_from_dev_tool", false));
        }
    }

    public C12695a(int i11, long j11, String str, int i12, int i13, String str2, ArrayList arrayList, boolean z11, EnumC22962a enumC22962a, boolean z12, boolean z13, boolean z14, String str3, boolean z15, boolean z16) {
        AbstractC19074t.m100208f(str, "albumName");
        AbstractC19074t.m100208f(str2, "messageReachLimit");
        AbstractC19074t.m100208f(arrayList, "externalSelectedItems");
        AbstractC19074t.m100208f(enumC22962a, "mediaPickerSource");
        AbstractC19074t.m100208f(str3, "actionPickMediaEditViewAspectRatio");
        this.f66086a = i11;
        this.f66087b = j11;
        this.f66088c = str;
        this.f66089d = i12;
        this.f66090e = i13;
        this.f66091f = str2;
        this.f66092g = arrayList;
        this.f66093h = z11;
        this.f66094i = enumC22962a;
        this.f66095j = z12;
        this.f66096k = z13;
        this.f66097l = z14;
        this.f66098m = str3;
        this.f66099n = z15;
        this.f66100o = z16;
    }

    /* renamed from: a */
    public final String m71499a() {
        return this.f66098m;
    }

    /* renamed from: b */
    public final int m71500b() {
        return this.f66086a;
    }

    /* renamed from: c */
    public final long m71501c() {
        return this.f66087b;
    }

    /* renamed from: d */
    public final String m71502d() {
        return this.f66088c;
    }

    /* renamed from: e */
    public final boolean m71503e() {
        return this.f66096k;
    }

    /* renamed from: f */
    public final ArrayList m71504f() {
        return this.f66092g;
    }

    /* renamed from: g */
    public final EnumC22962a m71505g() {
        return this.f66094i;
    }

    /* renamed from: h */
    public final int m71506h() {
        return this.f66089d;
    }

    /* renamed from: i */
    public final boolean m71507i() {
        return this.f66097l;
    }

    /* renamed from: j */
    public final boolean m71508j() {
        return this.f66099n;
    }

    /* renamed from: k */
    public final boolean m71509k() {
        return this.f66093h;
    }

    /* renamed from: l */
    public final boolean m71510l() {
        return this.f66095j;
    }
}
