package com.zing.zalo.adapters;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.zviews.GroupAdminMemberView;
import com.zing.zalo.p077ui.zviews.GroupAllMemberView;
import com.zing.zalo.p077ui.zviews.GroupBlockedMemberView;
import com.zing.zalo.p077ui.zviews.GroupInvitedMemberView;
import com.zing.zalo.p077ui.zviews.TabLoadingView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import java.util.HashMap;
import java.util.Locale;
import me0.AbstractC23136l9;

/* renamed from: com.zing.zalo.adapters.n3 */
/* loaded from: classes3.dex */
public final class C7149n3 extends AbstractC17505t0 {

    /* renamed from: A */
    private final String f39108A;

    /* renamed from: B */
    private final HashMap f39109B;

    /* renamed from: C */
    private final Integer[] f39110C;

    /* renamed from: D */
    private final Runnable f39111D;

    /* renamed from: w */
    private final boolean f39112w;

    /* renamed from: x */
    private boolean[] f39113x;

    /* renamed from: y */
    private int f39114y;

    /* renamed from: z */
    private Handler f39115z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7149n3(C17487o0 c17487o0, String str, boolean z11, boolean z12) {
        super(c17487o0);
        int i11;
        Integer[] numArr;
        AbstractC19074t.m100208f(str, "groupId");
        this.f39112w = z12;
        this.f39113x = new boolean[]{true, false, false, false};
        this.f39115z = new Handler(Looper.getMainLooper());
        this.f39108A = str;
        HashMap hashMap = new HashMap();
        hashMap.put(0, AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_all_member));
        if (z12) {
            i11 = AbstractC8020f0.str_community_tab_owner_admin;
        } else {
            i11 = AbstractC8020f0.str_tab_owner_admin;
        }
        hashMap.put(1, AbstractC23136l9.m118743r0(i11));
        hashMap.put(2, AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_invited));
        hashMap.put(3, AbstractC23136l9.m118743r0(AbstractC8020f0.str_tab_blocked));
        this.f39109B = hashMap;
        if (z11) {
            numArr = new Integer[]{0, 1, 2, 3};
        } else {
            numArr = new Integer[]{0, 2};
        }
        this.f39110C = numArr;
        this.f39111D = new Runnable() { // from class: com.zing.zalo.adapters.m3
            @Override // java.lang.Runnable
            public final void run() {
                C7149n3.m36368F(C7149n3.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: F */
    public static final void m36368F(C7149n3 c7149n3) {
        AbstractC19074t.m100208f(c7149n3, "this$0");
        try {
            int i11 = c7149n3.f39114y;
            boolean[] zArr = c7149n3.f39113x;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
            c7149n3.mo35341m();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B */
    public final int m36369B(int i11) {
        return this.f39110C[i11].intValue();
    }

    /* renamed from: C */
    public final Integer[] m36370C() {
        return this.f39110C;
    }

    /* renamed from: D */
    public final int m36371D(int i11) {
        int length = this.f39110C.length;
        for (int i12 = 0; i12 < length; i12++) {
            if (this.f39110C[i12].intValue() == i11) {
                return i12;
            }
        }
        return -1;
    }

    /* renamed from: E */
    public final void m36372E(int i11) {
        boolean[] zArr = this.f39113x;
        if (i11 < zArr.length) {
            this.f39114y = i11;
            if (!zArr[i11]) {
                Handler handler = this.f39115z;
                handler.removeCallbacks(this.f39111D);
                handler.post(this.f39111D);
            }
        }
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f39110C.length;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: h */
    public int mo35336h(Object obj) {
        ZaloView zaloView;
        AbstractC19074t.m100208f(obj, "item");
        if (obj instanceof ZaloView) {
            zaloView = (ZaloView) obj;
        } else {
            zaloView = null;
        }
        if (zaloView == null || !zaloView.m92674mJ() || zaloView.m92677nJ()) {
            return -2;
        }
        if (!(obj instanceof GroupAllMemberView) && !(obj instanceof GroupAdminMemberView) && !(obj instanceof GroupBlockedMemberView)) {
            return -2;
        }
        return -1;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: i */
    public CharSequence mo35337i(int i11) {
        String str = (String) this.f39109B.get(Integer.valueOf(this.f39110C[i11].intValue()));
        if (str == null) {
            return "";
        }
        Locale locale = Locale.getDefault();
        AbstractC19074t.m100207e(locale, "getDefault(...)");
        String upperCase = str.toUpperCase(locale);
        AbstractC19074t.m100207e(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        ZaloView m79919b;
        Bundle bundle = new Bundle();
        if (!this.f39113x[i11]) {
            m79919b = new TabLoadingView();
        } else {
            int intValue = this.f39110C[i11].intValue();
            if (intValue != 0) {
                if (intValue != 1) {
                    if (intValue != 2) {
                        if (intValue != 3) {
                            m79919b = new TabLoadingView();
                        } else {
                            bundle.putString("extra_group_id", this.f39108A);
                            bundle.putBoolean("EXTRA_IS_HIDE_ACTION_BAR", true);
                            m79919b = GroupBlockedMemberView.Companion.m79938a(bundle);
                        }
                    } else {
                        bundle.putString("extra_group_id", this.f39108A);
                        bundle.putBoolean("EXTRA_IS_HIDE_ACTION_BAR", true);
                        m79919b = GroupInvitedMemberView.Companion.m80179a(bundle);
                    }
                } else {
                    bundle.putString("extra_group_id", this.f39108A);
                    bundle.putBoolean("EXTRA_IS_HIDE_ACTION_BAR", true);
                    m79919b = GroupAdminMemberView.Companion.m79878b(bundle);
                }
            } else {
                bundle.putString("extra_group_id", this.f39108A);
                bundle.putBoolean("EXTRA_IS_HIDE_ACTION_BAR", true);
                m79919b = GroupAllMemberView.Companion.m79919b(bundle);
            }
        }
        m79919b.mo60305zK(bundle);
        return m79919b;
    }
}
