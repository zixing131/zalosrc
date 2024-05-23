package q90;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.p077ui.picker.mycloud.filepage.MyCloudFilePickerPage;
import com.zing.zalo.p077ui.picker.mycloud.gridallmessagepage.GridAllMessageMyCloudPickerPage;
import com.zing.zalo.p077ui.picker.mycloud.linkpage.MyCloudLinkPickerPage;
import com.zing.zalo.p077ui.picker.mycloud.mediapage.MyCloudMediaPickerPage;
import com.zing.zalo.p077ui.picker.mycloud.textpage.MyCloudTextPickerPage;
import com.zing.zalo.p077ui.zviews.TabLoadingView;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import mw.EnumC23460e;
import p365nk.C23805a;
import p90.InterfaceC24697q;
import q90.C25201d;

/* renamed from: q90.b */
/* loaded from: classes6.dex */
public final class C25199b extends AbstractC17505t0 {

    /* renamed from: A */
    private C25201d.a f120927A;

    /* renamed from: B */
    private a f120928B;

    /* renamed from: C */
    private boolean f120929C;

    /* renamed from: D */
    private List f120930D;

    /* renamed from: E */
    private final Runnable f120931E;

    /* renamed from: w */
    private String f120932w;

    /* renamed from: x */
    private boolean[] f120933x;

    /* renamed from: y */
    private int f120934y;

    /* renamed from: z */
    private Handler f120935z;

    /* renamed from: q90.b$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: a */
        ArrayList mo130441a();
    }

    /* renamed from: q90.b$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f120936a;

        static {
            int[] iArr = new int[EnumC23460e.values().length];
            try {
                iArr[EnumC23460e.f113955q.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23460e.f113956r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC23460e.f113957s.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC23460e.f113958t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC23460e.f113959u.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f120936a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25199b(C17487o0 c17487o0, String str, List list) {
        super(c17487o0);
        AbstractC19074t.m100208f(str, "mConversationId");
        AbstractC19074t.m100208f(list, "tabViewList");
        this.f120932w = str;
        this.f120933x = new boolean[list.size()];
        this.f120935z = new Handler(Looper.getMainLooper());
        this.f120930D = new ArrayList(list);
        this.f120931E = new Runnable() { // from class: q90.a
            @Override // java.lang.Runnable
            public final void run() {
                C25199b.m130435D(C25199b.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: D */
    public static final void m130435D(C25199b c25199b) {
        AbstractC19074t.m100208f(c25199b, "this$0");
        try {
            int i11 = c25199b.f120934y;
            boolean[] zArr = c25199b.f120933x;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
            c25199b.mo35341m();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B */
    public final int m130436B() {
        return this.f120934y;
    }

    /* renamed from: C */
    public final void m130437C(int i11) {
        try {
            if (i11 < this.f120933x.length) {
                this.f120934y = i11;
                this.f120935z.removeCallbacks(this.f120931E);
                this.f120935z.post(this.f120931E);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: E */
    public final void m130438E(C25201d.a aVar) {
        this.f120927A = aVar;
        int size = this.f89199t.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC1801w interfaceC1801w = (ZaloView) this.f89199t.get(i11);
            if (interfaceC1801w instanceof InterfaceC24697q) {
                ((InterfaceC24697q) interfaceC1801w).mo72571Vt(this.f120927A);
            }
        }
    }

    /* renamed from: F */
    public final void m130439F(int i11) {
        this.f120933x[i11] = true;
    }

    /* renamed from: G */
    public final void m130440G(a aVar) {
        this.f120928B = aVar;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f120930D.size();
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: h */
    public int mo35336h(Object obj) {
        ZaloView zaloView;
        AbstractC19074t.m100208f(obj, "object");
        try {
        } catch (Exception e11) {
            e11.printStackTrace();
        }
        if (this.f120929C) {
            this.f120929C = false;
            return -2;
        }
        if (obj instanceof ZaloView) {
            zaloView = (ZaloView) obj;
        } else {
            zaloView = null;
        }
        if (zaloView == null || !(obj instanceof InterfaceC24697q)) {
            return -2;
        }
        return -1;
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0, com.zing.p058v4.view.AbstractC6881a
    /* renamed from: o */
    public void mo35343o(Parcelable parcelable, ClassLoader classLoader) {
        super.mo35343o(parcelable, classLoader);
        try {
            int size = this.f89199t.size();
            for (int i11 = 0; i11 < size; i11++) {
                InterfaceC1801w interfaceC1801w = (ZaloView) this.f89199t.get(i11);
                if (interfaceC1801w instanceof InterfaceC24697q) {
                    ((InterfaceC24697q) interfaceC1801w).mo72571Vt(this.f120927A);
                    ((InterfaceC24697q) interfaceC1801w).mo72570Kz(this.f120928B);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        ZaloView gridAllMessageMyCloudPickerPage;
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", this.f120932w);
        bundle.putBoolean("bol_background_white", true);
        if (!this.f120933x[i11]) {
            gridAllMessageMyCloudPickerPage = new TabLoadingView();
        } else {
            if (!this.f89199t.isEmpty() && this.f120930D.size() > i11 && this.f89199t.get(i11) != null && !(this.f89199t.get(i11) instanceof TabLoadingView)) {
                gridAllMessageMyCloudPickerPage = (ZaloView) this.f89199t.get(i11);
            } else {
                int i12 = b.f120936a[((EnumC23460e) this.f120930D.get(i11)).ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                if (i12 == 5) {
                                    gridAllMessageMyCloudPickerPage = new MyCloudLinkPickerPage();
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                gridAllMessageMyCloudPickerPage = new MyCloudFilePickerPage();
                            }
                        } else {
                            gridAllMessageMyCloudPickerPage = MyCloudMediaPickerPage.Companion.m72575a(false);
                        }
                    } else {
                        gridAllMessageMyCloudPickerPage = new MyCloudTextPickerPage();
                    }
                } else {
                    bundle.putSerializable("extra_view_mode", C23805a.e.f115063p);
                    bundle.putBoolean("extra_is_in_search_mode", false);
                    gridAllMessageMyCloudPickerPage = new GridAllMessageMyCloudPickerPage();
                }
            }
            AbstractC19074t.m100205c(gridAllMessageMyCloudPickerPage);
        }
        gridAllMessageMyCloudPickerPage.mo60305zK(bundle);
        if (gridAllMessageMyCloudPickerPage instanceof InterfaceC24697q) {
            InterfaceC24697q interfaceC24697q = (InterfaceC24697q) gridAllMessageMyCloudPickerPage;
            interfaceC24697q.mo72571Vt(this.f120927A);
            interfaceC24697q.mo72570Kz(this.f120928B);
        }
        return gridAllMessageMyCloudPickerPage;
    }
}
