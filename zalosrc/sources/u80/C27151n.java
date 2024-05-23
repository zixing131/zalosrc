package u80;

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatImageView;
import bi0.AbstractC2807a;
import com.zing.zalo.AbstractC7921d0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.mycloud.model.MyCloudMessageItem;
import com.zing.zalo.zdesign.component.BottomSheet;
import com.zing.zalo.zdesign.component.EnumC17017m;
import com.zing.zalo.zdesign.component.ListItem;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import eg0.AbstractC18428c;
import fn0.AbstractC19074t;
import gw.AbstractC19620d0;
import gw.AbstractC19646n0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kw.C21955a;
import me0.AbstractC23222t7;
import mg.C23288a;
import mj0.AbstractC23322a;
import p246iw.C20843c0;
import p348mi.AbstractC23306f;
import p649xl.C30115x5;
import pk.C24799c;
import pm0.C24848g0;
import qm0.AbstractC25368s;
import ui0.C27280g;
import xd0.C29588d;

/* renamed from: u80.n */
/* loaded from: classes6.dex */
public final class C27151n extends BottomSheet {

    /* renamed from: b1 */
    private MyCloudMessageItem f127869b1;

    /* renamed from: c1 */
    private long f127870c1;

    /* renamed from: d1 */
    private C30115x5 f127871d1;

    public C27151n(MyCloudMessageItem myCloudMessageItem, long j11) {
        AbstractC19074t.m100208f(myCloudMessageItem, "data");
        this.f127869b1 = myCloudMessageItem;
        this.f127870c1 = j11;
    }

    /* renamed from: ML */
    private final KeyEventCallbackC17462c m139255ML() {
        final List m131506n;
        String str;
        try {
            m131506n = AbstractC25368s.m131506n(this.f127869b1.m71033m());
            C8009j.a m43159h = new C8009j.a(m92648SI()).m43159h(7);
            Context context = getContext();
            if (context != null) {
                Resources resources = context.getResources();
                if (resources != null) {
                    str = resources.getQuantityString(AbstractC7921d0.plural_delete_multi_messages_for_me_title, 1, 1);
                    if (str == null) {
                    }
                    return m43159h.m43172u(str).m43173v(2).m43162k(AbstractC19620d0.m102671H(m131506n, false)).m43155d(true).m43165n(m92652XI(AbstractC8020f0.str_cancel), null).m43170s(m92652XI(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: u80.j
                        @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                        /* renamed from: K8 */
                        public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                            C27151n.m139256NL(m131506n, this, interfaceC17463d, i11);
                        }
                    }).m43152a();
                }
            }
            str = "";
            return m43159h.m43172u(str).m43173v(2).m43162k(AbstractC19620d0.m102671H(m131506n, false)).m43155d(true).m43165n(m92652XI(AbstractC8020f0.str_cancel), null).m43170s(m92652XI(AbstractC8020f0.str_delete), new InterfaceC17463d.d() { // from class: u80.j
                @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
                /* renamed from: K8 */
                public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                    C27151n.m139256NL(m131506n, this, interfaceC17463d, i11);
                }
            }).m43152a();
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: NL */
    public static final void m139256NL(final List list, C27151n c27151n, InterfaceC17463d interfaceC17463d, int i11) {
        AbstractC19074t.m100208f(list, "$chatContents");
        AbstractC19074t.m100208f(c27151n, "this$0");
        try {
            if (!list.isEmpty()) {
                final String str = "204278670";
                AbstractC18428c.m97659b(C23288a.f113033a, "204278670", 0, new Runnable() { // from class: u80.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        C27151n.m139257OL(str, list);
                    }
                }, 2, null);
            }
            c27151n.close();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: OL */
    public static final void m139257OL(String str, List list) {
        AbstractC19074t.m100208f(str, "$uid");
        AbstractC19074t.m100208f(list, "$chatContents");
        AbstractC23306f.m120604O().m101508a(new C29588d.c(str, list, null, 4, null));
        AbstractC23306f.m120607P().m102641o(list);
    }

    /* renamed from: PL */
    private final void m139258PL() {
        C30115x5 c30115x5 = this.f127871d1;
        C30115x5 c30115x52 = null;
        if (c30115x5 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30115x5 = null;
        }
        c30115x5.f139900q.setIdTracking("my_cloud_detail_text_msg_remove");
        C30115x5 c30115x53 = this.f127871d1;
        if (c30115x53 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30115x53 = null;
        }
        c30115x53.f139900q.setOnClickListener(new View.OnClickListener() { // from class: u80.k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C27151n.m139259QL(C27151n.this, view);
            }
        });
        C30115x5 c30115x54 = this.f127871d1;
        if (c30115x54 == null) {
            AbstractC19074t.m100223u("viewBinding");
            c30115x54 = null;
        }
        c30115x54.f139901r.setIdTracking("my_cloud_detail_text_msg_pin");
        C30115x5 c30115x55 = this.f127871d1;
        if (c30115x55 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30115x52 = c30115x55;
        }
        c30115x52.f139901r.setOnClickListener(new View.OnClickListener() { // from class: u80.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C27151n.m139260RL(C27151n.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: QL */
    public static final void m139259QL(C27151n c27151n, View view) {
        AbstractC19074t.m100208f(c27151n, "this$0");
        c27151n.showDialog(1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: RL */
    public static final void m139260RL(C27151n c27151n, View view) {
        C20843c0 c20843c0;
        C24848g0 c24848g0;
        ArrayList m131500h;
        AbstractC19074t.m100208f(c27151n, "this$0");
        ArrayList arrayList = new ArrayList();
        arrayList.add(c27151n.f127869b1.m71033m().m95029V3());
        HashMap hashMap = new HashMap();
        hashMap.put(String.valueOf(AbstractC19646n0.m102878B(c27151n.f127869b1.m71033m().m95041W4(), false)), 1);
        C20843c0 m120602N0 = AbstractC23306f.m120602N0();
        C24799c m109056J0 = m120602N0.m109056J0();
        if (m109056J0 != null) {
            String m114637d = C21955a.f108070a.m114637d("detail_text_msgmenu", hashMap, m109056J0.m128832l());
            AbstractC19074t.m100205c(m120602N0);
            c20843c0 = m120602N0;
            C20843c0.m108969V(m120602N0, m109056J0.m128824d(), arrayList, (byte) 0, m109056J0.m128825e(), true, m114637d, false, 64, null);
            c24848g0 = C24848g0.f119245a;
        } else {
            c20843c0 = m120602N0;
            c24848g0 = null;
        }
        if (c24848g0 == null) {
            m131500h = AbstractC25368s.m131500h(c27151n.f127869b1.m71033m());
            c20843c0.m109076a0(true, m131500h);
        }
        c27151n.close();
    }

    /* renamed from: SL */
    private final void m139261SL() {
        m90533zL(EnumC17017m.HUG_CONTENT);
        C30115x5 c30115x5 = null;
        if (AbstractC23306f.m120602N0().m109081m1(this.f127870c1)) {
            C30115x5 c30115x52 = this.f127871d1;
            if (c30115x52 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30115x52 = null;
            }
            c30115x52.f139901r.setVisibility(8);
        } else {
            C30115x5 c30115x53 = this.f127871d1;
            if (c30115x53 == null) {
                AbstractC19074t.m100223u("viewBinding");
                c30115x53 = null;
            }
            ListItem listItem = c30115x53.f139901r;
            AppCompatImageView appCompatImageView = new AppCompatImageView(listItem.getContext());
            Context context = listItem.getContext();
            AbstractC19074t.m100207e(context, "getContext(...)");
            appCompatImageView.setImageDrawable(C27280g.m139660c(context, AbstractC23322a.zds_ic_pin_line_24, AbstractC2807a.icon_01));
            listItem.m90587c(appCompatImageView);
            listItem.m90592m(true);
            listItem.m90591l(AbstractC23222t7.f112545X, 0, 0, 0);
        }
        C30115x5 c30115x54 = this.f127871d1;
        if (c30115x54 == null) {
            AbstractC19074t.m100223u("viewBinding");
        } else {
            c30115x5 = c30115x54;
        }
        ListItem listItem2 = c30115x5.f139900q;
        AppCompatImageView appCompatImageView2 = new AppCompatImageView(listItem2.getContext());
        Context context2 = listItem2.getContext();
        AbstractC19074t.m100207e(context2, "getContext(...)");
        appCompatImageView2.setImageDrawable(C27280g.m139660c(context2, AbstractC23322a.zds_ic_delete_line_24, AbstractC2807a.icon_01));
        listItem2.m90587c(appCompatImageView2);
        listItem2.m90592m(false);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        if (i11 == 1) {
            return m139255ML();
        }
        return null;
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet
    /* renamed from: lL */
    protected void mo45682lL(LayoutInflater layoutInflater, LinearLayout linearLayout, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        C30115x5 m148685c = C30115x5.m148685c(layoutInflater, linearLayout, true);
        AbstractC19074t.m100207e(m148685c, "inflate(...)");
        this.f127871d1 = m148685c;
        m139261SL();
        m139258PL();
    }

    @Override // com.zing.zalo.zdesign.component.BottomSheet, com.zing.zalo.zdesign.component.bottomsheet.BottomSheetLayout.InterfaceC16954a
    /* renamed from: x3 */
    public void mo90529x3() {
        close();
    }
}
