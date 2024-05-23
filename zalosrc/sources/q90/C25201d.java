package q90;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import androidx.lifecycle.InterfaceC1801w;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.p077ui.picker.mycloud.filepage.MyCloudFilePickerPage;
import com.zing.zalo.p077ui.picker.mycloud.linkpage.MyCloudLinkPickerPage;
import com.zing.zalo.p077ui.picker.mycloud.mediapage.MyCloudMediaPickerPage;
import com.zing.zalo.p077ui.picker.mycloud.model.SelectedItemData;
import com.zing.zalo.p077ui.picker.mycloud.textpage.MyCloudTextPickerPage;
import com.zing.zalo.p077ui.zviews.TabLoadingView;
import com.zing.zalo.uidrawing.C16719g;
import com.zing.zalo.zview.AbstractC17505t0;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.ZaloView;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.List;
import mw.EnumC23460e;
import p90.InterfaceC24697q;

/* renamed from: q90.d */
/* loaded from: classes6.dex */
public final class C25201d extends AbstractC17505t0 {

    /* renamed from: A */
    private a f120938A;

    /* renamed from: B */
    private boolean f120939B;

    /* renamed from: C */
    private List f120940C;

    /* renamed from: D */
    private final Runnable f120941D;

    /* renamed from: w */
    private String f120942w;

    /* renamed from: x */
    private boolean[] f120943x;

    /* renamed from: y */
    private int f120944y;

    /* renamed from: z */
    private Handler f120945z;

    /* renamed from: q90.d$a */
    /* loaded from: classes6.dex */
    public interface a {
        /* renamed from: O1 */
        boolean mo72544O1(SelectedItemData selectedItemData, boolean z11);

        /* renamed from: Y0 */
        boolean mo72545Y0();

        /* renamed from: Z0 */
        String mo72546Z0();

        /* renamed from: a1 */
        void mo72547a1(MyCloudMessageItem myCloudMessageItem, C16719g c16719g);

        /* renamed from: v */
        List mo72548v();

        /* renamed from: v1 */
        void mo72549v1(SelectedItemData selectedItemData, boolean z11);
    }

    /* renamed from: q90.d$b */
    /* loaded from: classes6.dex */
    public /* synthetic */ class b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f120946a;

        static {
            int[] iArr = new int[EnumC23460e.values().length];
            try {
                iArr[EnumC23460e.f113956r.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC23460e.f113957s.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC23460e.f113959u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC23460e.f113958t.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f120946a = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25201d(C17487o0 c17487o0, String str, List list) {
        super(c17487o0);
        AbstractC19074t.m100208f(str, "mConversationId");
        AbstractC19074t.m100208f(list, "tabViewList");
        this.f120942w = str;
        this.f120943x = new boolean[list.size()];
        this.f120945z = new Handler(Looper.getMainLooper());
        this.f120940C = new ArrayList(list);
        this.f120941D = new Runnable() { // from class: q90.c
            @Override // java.lang.Runnable
            public final void run() {
                C25201d.m130443C(C25201d.this);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: C */
    public static final void m130443C(C25201d c25201d) {
        AbstractC19074t.m100208f(c25201d, "this$0");
        try {
            int i11 = c25201d.f120944y;
            boolean[] zArr = c25201d.f120943x;
            if (i11 < zArr.length) {
                zArr[i11] = true;
            }
            c25201d.mo35341m();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: B */
    public final void m130444B(int i11) {
        try {
            if (i11 < this.f120943x.length) {
                this.f120944y = i11;
                this.f120945z.removeCallbacks(this.f120941D);
                this.f120945z.post(this.f120941D);
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: D */
    public final void m130445D(a aVar) {
        this.f120938A = aVar;
        int size = this.f89199t.size();
        for (int i11 = 0; i11 < size; i11++) {
            InterfaceC1801w interfaceC1801w = (ZaloView) this.f89199t.get(i11);
            if (interfaceC1801w instanceof InterfaceC24697q) {
                ((InterfaceC24697q) interfaceC1801w).mo72571Vt(this.f120938A);
            }
        }
    }

    /* renamed from: E */
    public final void m130446E(int i11) {
        this.f120943x[i11] = true;
    }

    @Override // com.zing.p058v4.view.AbstractC6881a
    /* renamed from: g */
    public int mo35335g() {
        return this.f120940C.size();
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
        if (this.f120939B) {
            this.f120939B = false;
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
                    ((InterfaceC24697q) interfaceC1801w).mo72571Vt(this.f120938A);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.zview.AbstractC17505t0
    /* renamed from: w */
    public ZaloView mo36135w(int i11) {
        ZaloView myCloudTextPickerPage;
        Bundle bundle = new Bundle();
        bundle.putString("extra_conversation_id", this.f120942w);
        bundle.putBoolean("bol_background_white", true);
        if (!this.f120943x[i11]) {
            myCloudTextPickerPage = new TabLoadingView();
        } else {
            if (!this.f89199t.isEmpty() && this.f120940C.size() > i11 && this.f89199t.get(i11) != null && !(this.f89199t.get(i11) instanceof TabLoadingView)) {
                myCloudTextPickerPage = (ZaloView) this.f89199t.get(i11);
            } else {
                int i12 = b.f120946a[((EnumC23460e) this.f120940C.get(i11)).ordinal()];
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                myCloudTextPickerPage = new TabLoadingView();
                            } else {
                                myCloudTextPickerPage = new MyCloudFilePickerPage();
                            }
                        } else {
                            myCloudTextPickerPage = new MyCloudLinkPickerPage();
                        }
                    } else {
                        myCloudTextPickerPage = new MyCloudMediaPickerPage();
                    }
                } else {
                    myCloudTextPickerPage = new MyCloudTextPickerPage();
                }
            }
            AbstractC19074t.m100205c(myCloudTextPickerPage);
        }
        myCloudTextPickerPage.mo60305zK(bundle);
        if (myCloudTextPickerPage instanceof InterfaceC24697q) {
            ((InterfaceC24697q) myCloudTextPickerPage).mo72571Vt(this.f120938A);
        }
        return myCloudTextPickerPage;
    }
}
