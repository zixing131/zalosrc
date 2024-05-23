package vg0;

import com.zing.zalo.zalocloud.migration.InterfaceC16863c;
import fn0.AbstractC19074t;
import java.util.Map;
import p487rl.EnumC25825f;
import tg0.C26676b;

/* renamed from: vg0.a */
/* loaded from: classes7.dex */
public final class C28250a implements InterfaceC16863c {

    /* renamed from: a */
    public static final C28250a f131719a = new C28250a();

    /* renamed from: vg0.a$a */
    /* loaded from: classes7.dex */
    public /* synthetic */ class a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f131720a;

        static {
            int[] iArr = new int[EnumC25825f.values().length];
            try {
                iArr[EnumC25825f.f123208q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25825f.f123209r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25825f.f123210s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25825f.f123211t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f131720a = iArr;
        }
    }

    private C28250a() {
    }

    @Override // com.zing.zalo.zalocloud.migration.InterfaceC16863c
    /* renamed from: a */
    public void mo90074a() {
        C26676b.f126324a.m136977P();
    }

    @Override // com.zing.zalo.zalocloud.migration.InterfaceC16863c
    /* renamed from: b */
    public void mo90075b() {
        C26676b.f126324a.m136981T();
    }

    @Override // com.zing.zalo.zalocloud.migration.InterfaceC16863c
    /* renamed from: c */
    public void mo90076c(EnumC25825f enumC25825f, Map map) {
        AbstractC19074t.m100208f(enumC25825f, "itemType");
        AbstractC19074t.m100208f(map, "params");
        int i11 = a.f131720a[enumC25825f.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    C26676b.f126324a.m136982U(C26676b.a.f126325q);
                    return;
                }
                return;
            }
            C26676b.f126324a.m136984W();
            return;
        }
        C26676b.f126324a.m136986Y();
    }

    @Override // com.zing.zalo.zalocloud.migration.InterfaceC16863c
    /* renamed from: d */
    public void mo90077d(int i11, int i12, int i13, int i14) {
        C26676b.f126324a.m136980S(i11, i12, i13, i14);
    }

    @Override // com.zing.zalo.zalocloud.migration.InterfaceC16863c
    /* renamed from: e */
    public void mo90078e(EnumC25825f enumC25825f) {
        AbstractC19074t.m100208f(enumC25825f, "itemType");
        int i11 = a.f131720a[enumC25825f.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 == 3) {
                    C26676b.f126324a.m136983V();
                    return;
                }
                return;
            }
            C26676b.f126324a.m136985X();
            return;
        }
        C26676b.f126324a.m136987Z();
    }

    @Override // com.zing.zalo.zalocloud.migration.InterfaceC16863c
    public void onStart() {
        C26676b.f126324a.m136992e0();
    }
}
