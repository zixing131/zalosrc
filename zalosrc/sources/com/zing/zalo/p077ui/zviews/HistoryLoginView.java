package com.zing.zalo.p077ui.zviews;

import ac.InterfaceC0733x;
import ae.C0766k;
import ae.InterfaceC0765j;
import android.content.Intent;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.p058v4.widget.SwipeRefreshLayout;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7225u2;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.HistoryLoginView;
import com.zing.zalo.p077ui.zviews.multistate.MultiStateView;
import com.zing.zalo.uicontrol.SwipeRefreshListView;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zdesign.component.header.ZdsActionBar;
import com.zing.zalo.zview.C17487o0;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalo.zview.dialog.KeyEventCallbackC17462c;
import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.List;
import ln0.AbstractC22543l;
import me0.AbstractC23136l9;
import me0.C23055e5;
import me0.C23212s8;
import on0.AbstractC24342w;
import org.json.JSONArray;
import org.json.JSONObject;
import p133ek.AbstractC18458a;
import p361nb.AbstractC23647d;
import p716zh.C32077q6;

/* loaded from: classes6.dex */
public final class HistoryLoginView extends SlidableZaloView implements C7225u2.a, InterfaceC0733x {
    public static final C14456a Companion = new C14456a(null);

    /* renamed from: Q0 */
    private SwipeRefreshListView f74284Q0;

    /* renamed from: R0 */
    private RecyclerView f74285R0;

    /* renamed from: S0 */
    private MultiStateView f74286S0;

    /* renamed from: T0 */
    private volatile boolean f74287T0;

    /* renamed from: U0 */
    private InterfaceC0765j f74288U0;

    /* renamed from: V0 */
    private InterfaceC20094a f74289V0;

    /* renamed from: W0 */
    private volatile boolean f74290W0;

    /* renamed from: X0 */
    private InterfaceC0765j f74291X0;

    /* renamed from: Y0 */
    private InterfaceC20094a f74292Y0;

    /* renamed from: a1 */
    private int f74294a1;

    /* renamed from: b1 */
    private C7225u2 f74295b1;

    /* renamed from: c1 */
    private C32077q6 f74296c1;

    /* renamed from: d1 */
    private C32077q6 f74297d1;

    /* renamed from: e1 */
    private List f74298e1;

    /* renamed from: f1 */
    private List f74299f1;

    /* renamed from: g1 */
    private View f74300g1;

    /* renamed from: h1 */
    private boolean f74301h1;

    /* renamed from: l1 */
    private int f74305l1;

    /* renamed from: m1 */
    private int f74306m1;

    /* renamed from: n1 */
    private int f74307n1;

    /* renamed from: o1 */
    private CheckBox f74308o1;

    /* renamed from: P0 */
    private final int f74283P0 = 20123;

    /* renamed from: Z0 */
    private final int f74293Z0 = 1;

    /* renamed from: i1 */
    private int f74302i1 = 5;

    /* renamed from: j1 */
    private int f74303j1 = 5;

    /* renamed from: k1 */
    private int f74304k1 = 5;

    /* renamed from: com.zing.zalo.ui.zviews.HistoryLoginView$a */
    /* loaded from: classes6.dex */
    public static final class C14456a {
        private C14456a() {
        }

        public /* synthetic */ C14456a(AbstractC19060k abstractC19060k) {
            this();
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.HistoryLoginView$b */
    /* loaded from: classes6.dex */
    public static final class C14457b implements InterfaceC20094a {
        C14457b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: e */
        public static final void m80742e(HistoryLoginView historyLoginView) {
            List m80729lM;
            AbstractC19074t.m100208f(historyLoginView, "this$0");
            SwipeRefreshListView m80734qM = historyLoginView.m80734qM();
            if (m80734qM != null) {
                m80734qM.setRefreshing(false);
            }
            C7225u2 m80732oM = historyLoginView.m80732oM();
            if (m80732oM != null) {
                if (historyLoginView.m80737vM()) {
                    m80729lM = historyLoginView.m80730mM();
                } else {
                    m80729lM = historyLoginView.m80729lM();
                }
                AbstractC19074t.m100205c(m80729lM);
                m80732oM.m36740O(m80729lM);
            }
            historyLoginView.m80739zM(false);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static final void m80743f(HistoryLoginView historyLoginView, C20096c c20096c) {
            AbstractC19074t.m100208f(historyLoginView, "this$0");
            AbstractC19074t.m100208f(c20096c, "$error_message");
            SwipeRefreshListView m80734qM = historyLoginView.m80734qM();
            if (m80734qM != null) {
                m80734qM.setRefreshing(false);
            }
            historyLoginView.m80739zM(false);
            if (c20096c.m104491c() == 50001) {
                MultiStateView m80733pM = historyLoginView.m80733pM();
                if (m80733pM != null) {
                    m80733pM.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.NETWORK_ERROR_MSG));
                }
                MultiStateView m80733pM2 = historyLoginView.m80733pM();
                if (m80733pM2 != null) {
                    m80733pM2.setErrorType(MultiStateView.EnumC15915f.NETWORK_ERROR);
                    return;
                }
                return;
            }
            MultiStateView m80733pM3 = historyLoginView.m80733pM();
            if (m80733pM3 != null) {
                m80733pM3.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_loadingList));
            }
            MultiStateView m80733pM4 = historyLoginView.m80733pM();
            if (m80733pM4 != null) {
                m80733pM4.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(final C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            HistoryLoginView.this.m80720CM(false);
            final HistoryLoginView historyLoginView = HistoryLoginView.this;
            historyLoginView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.tp
                @Override // java.lang.Runnable
                public final void run() {
                    HistoryLoginView.C14457b.m80743f(HistoryLoginView.this, c20096c);
                }
            });
        }

        /* JADX WARN: Removed duplicated region for block: B:13:0x00a7 A[Catch: all -> 0x008e, Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:3:0x0016, B:5:0x0078, B:11:0x0097, B:13:0x00a7, B:15:0x00ad, B:17:0x00d0, B:19:0x00e1, B:26:0x00ec, B:28:0x00ef, B:30:0x00f2, B:25:0x00f4, B:34:0x00fb, B:35:0x010d, B:37:0x0122, B:39:0x0128, B:41:0x014c, B:43:0x015d, B:49:0x0175, B:51:0x017a, B:53:0x018a, B:55:0x0169, B:56:0x016c, B:57:0x0170, B:60:0x018f, B:61:0x01c9), top: B:2:0x0016, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:17:0x00d0 A[Catch: all -> 0x008e, Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:3:0x0016, B:5:0x0078, B:11:0x0097, B:13:0x00a7, B:15:0x00ad, B:17:0x00d0, B:19:0x00e1, B:26:0x00ec, B:28:0x00ef, B:30:0x00f2, B:25:0x00f4, B:34:0x00fb, B:35:0x010d, B:37:0x0122, B:39:0x0128, B:41:0x014c, B:43:0x015d, B:49:0x0175, B:51:0x017a, B:53:0x018a, B:55:0x0169, B:56:0x016c, B:57:0x0170, B:60:0x018f, B:61:0x01c9), top: B:2:0x0016, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:37:0x0122 A[Catch: all -> 0x008e, Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:3:0x0016, B:5:0x0078, B:11:0x0097, B:13:0x00a7, B:15:0x00ad, B:17:0x00d0, B:19:0x00e1, B:26:0x00ec, B:28:0x00ef, B:30:0x00f2, B:25:0x00f4, B:34:0x00fb, B:35:0x010d, B:37:0x0122, B:39:0x0128, B:41:0x014c, B:43:0x015d, B:49:0x0175, B:51:0x017a, B:53:0x018a, B:55:0x0169, B:56:0x016c, B:57:0x0170, B:60:0x018f, B:61:0x01c9), top: B:2:0x0016, outer: #1 }] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x014c A[Catch: all -> 0x008e, Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:3:0x0016, B:5:0x0078, B:11:0x0097, B:13:0x00a7, B:15:0x00ad, B:17:0x00d0, B:19:0x00e1, B:26:0x00ec, B:28:0x00ef, B:30:0x00f2, B:25:0x00f4, B:34:0x00fb, B:35:0x010d, B:37:0x0122, B:39:0x0128, B:41:0x014c, B:43:0x015d, B:49:0x0175, B:51:0x017a, B:53:0x018a, B:55:0x0169, B:56:0x016c, B:57:0x0170, B:60:0x018f, B:61:0x01c9), top: B:2:0x0016, outer: #1 }] */
        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void mo927b(Object obj) {
            JSONObject jSONObject;
            int m116584g;
            int m116584g2;
            int m116584g3;
            C32077q6 m154730b;
            int i11;
            int i12;
            int i13;
            int i14;
            JSONArray optJSONArray;
            JSONArray optJSONArray2;
            int length;
            int i15;
            int length2;
            int i16;
            AbstractC19074t.m100208f(obj, "entity");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            try {
                try {
                    jSONObject = ((JSONObject) obj).getJSONObject("data");
                    HistoryLoginView historyLoginView = HistoryLoginView.this;
                    m116584g = AbstractC22543l.m116584g(jSONObject.optInt("max_trusted_devices_mobile", 5), 1);
                    historyLoginView.m80726IM(m116584g);
                    HistoryLoginView historyLoginView2 = HistoryLoginView.this;
                    m116584g2 = AbstractC22543l.m116584g(jSONObject.optInt("max_trusted_devices_pc", 5), 1);
                    historyLoginView2.m80727JM(m116584g2);
                    HistoryLoginView historyLoginView3 = HistoryLoginView.this;
                    m116584g3 = AbstractC22543l.m116584g(jSONObject.optInt("max_trusted_devices_web", 5), 1);
                    historyLoginView3.m80728KM(m116584g3);
                    C32077q6 c32077q6 = new C32077q6(C32077q6.f147698B);
                    c32077q6.f147708a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_lable_device_this);
                    arrayList.add(c32077q6);
                    m154730b = C32077q6.m154730b(jSONObject.getJSONObject("current_device"));
                    AbstractC19074t.m100207e(m154730b, "createInstanceFromJsonNew(...)");
                    m154730b.f147722o = false;
                    i11 = 2;
                    m154730b.f147712e = 2;
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
                if (m154730b.m154735g()) {
                    int m154734f = m154730b.m154734f();
                    if (m154734f != 1) {
                        if (m154734f != 2) {
                            if (m154734f == 3) {
                                i12 = 0;
                                i13 = 0;
                                i14 = 1;
                                arrayList.add(m154730b);
                                HistoryLoginView.this.m80725HM(m154730b);
                                optJSONArray = jSONObject.optJSONArray("logged_in_devices");
                                if (optJSONArray != null && optJSONArray.length() > 0) {
                                    arrayList.add(new C32077q6(C32077q6.f147699C));
                                    C32077q6 c32077q62 = new C32077q6(C32077q6.f147698B);
                                    c32077q62.f147708a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_lable_logged_in);
                                    arrayList.add(c32077q62);
                                    length2 = optJSONArray.length();
                                    for (i16 = 0; i16 < length2; i16++) {
                                        C32077q6 m154730b2 = C32077q6.m154730b(optJSONArray.getJSONObject(i16));
                                        AbstractC19074t.m100207e(m154730b2, "createInstanceFromJsonNew(...)");
                                        if (m154730b2.m154735g()) {
                                            int m154734f2 = m154730b2.m154734f();
                                            if (m154734f2 != 1) {
                                                if (m154734f2 != 2) {
                                                    if (m154734f2 == 3) {
                                                        i14++;
                                                    }
                                                } else {
                                                    i13++;
                                                }
                                            } else {
                                                i12++;
                                            }
                                        }
                                        arrayList.add(m154730b2);
                                    }
                                    C32077q6 c32077q63 = new C32077q6(C32077q6.f147701E);
                                    c32077q63.f147708a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_logout_all);
                                    arrayList.add(c32077q63);
                                }
                                JSONObject jSONObject2 = jSONObject.getJSONObject("logged_out_devices");
                                int optInt = jSONObject2.optInt("show", 0);
                                optJSONArray2 = jSONObject2.optJSONArray("devices");
                                if (optJSONArray2 != null && optJSONArray2.length() > 0) {
                                    arrayList.add(new C32077q6(C32077q6.f147699C));
                                    C32077q6 c32077q64 = new C32077q6(C32077q6.f147698B);
                                    c32077q64.f147708a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_lable_logged_out);
                                    arrayList.add(c32077q64);
                                    length = optJSONArray2.length();
                                    i15 = 0;
                                    int i17 = 0;
                                    while (i15 < length) {
                                        C32077q6 m154730b3 = C32077q6.m154730b(optJSONArray2.getJSONObject(i15));
                                        AbstractC19074t.m100207e(m154730b3, "createInstanceFromJsonNew(...)");
                                        if (m154730b3.m154735g()) {
                                            int m154734f3 = m154730b3.m154734f();
                                            if (m154734f3 != 1) {
                                                if (m154734f3 != i11) {
                                                    if (m154734f3 == 3) {
                                                        i14++;
                                                    }
                                                } else {
                                                    i13++;
                                                }
                                            } else {
                                                i12++;
                                            }
                                        }
                                        arrayList2.add(m154730b3);
                                        if (i17 < optInt) {
                                            C32077q6 m154730b4 = C32077q6.m154730b(optJSONArray2.getJSONObject(i15));
                                            AbstractC19074t.m100207e(m154730b4, "createInstanceFromJsonNew(...)");
                                            arrayList.add(m154730b4);
                                            i17++;
                                        }
                                        i15++;
                                        i11 = 2;
                                    }
                                    ((C32077q6) arrayList2.get(arrayList2.size() - 1)).f147723p = false;
                                    ((C32077q6) arrayList.get(arrayList.size() - 1)).f147723p = false;
                                    C32077q6 c32077q65 = new C32077q6(C32077q6.f147702F);
                                    c32077q65.f147708a = AbstractC23136l9.m118746s0(AbstractC8020f0.str_btn_see_all_device, Integer.valueOf(optJSONArray2.length()));
                                    arrayList.add(c32077q65);
                                }
                                HistoryLoginView.this.m80722EM(i12);
                                HistoryLoginView.this.m80723FM(i13);
                                HistoryLoginView.this.m80724GM(i14);
                                HistoryLoginView.this.m80718AM(arrayList);
                                HistoryLoginView.this.m80719BM(arrayList2);
                                final HistoryLoginView historyLoginView4 = HistoryLoginView.this;
                                historyLoginView4.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.sp
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        HistoryLoginView.C14457b.m80742e(HistoryLoginView.this);
                                    }
                                });
                                HistoryLoginView.this.m80720CM(false);
                            }
                        } else {
                            i12 = 0;
                            i13 = 1;
                            i14 = 0;
                            arrayList.add(m154730b);
                            HistoryLoginView.this.m80725HM(m154730b);
                            optJSONArray = jSONObject.optJSONArray("logged_in_devices");
                            if (optJSONArray != null) {
                                arrayList.add(new C32077q6(C32077q6.f147699C));
                                C32077q6 c32077q622 = new C32077q6(C32077q6.f147698B);
                                c32077q622.f147708a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_lable_logged_in);
                                arrayList.add(c32077q622);
                                length2 = optJSONArray.length();
                                while (i16 < length2) {
                                }
                                C32077q6 c32077q632 = new C32077q6(C32077q6.f147701E);
                                c32077q632.f147708a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_logout_all);
                                arrayList.add(c32077q632);
                            }
                            JSONObject jSONObject22 = jSONObject.getJSONObject("logged_out_devices");
                            int optInt2 = jSONObject22.optInt("show", 0);
                            optJSONArray2 = jSONObject22.optJSONArray("devices");
                            if (optJSONArray2 != null) {
                                arrayList.add(new C32077q6(C32077q6.f147699C));
                                C32077q6 c32077q642 = new C32077q6(C32077q6.f147698B);
                                c32077q642.f147708a = AbstractC23136l9.m118743r0(AbstractC8020f0.str_lable_logged_out);
                                arrayList.add(c32077q642);
                                length = optJSONArray2.length();
                                i15 = 0;
                                int i172 = 0;
                                while (i15 < length) {
                                }
                                ((C32077q6) arrayList2.get(arrayList2.size() - 1)).f147723p = false;
                                ((C32077q6) arrayList.get(arrayList.size() - 1)).f147723p = false;
                                C32077q6 c32077q652 = new C32077q6(C32077q6.f147702F);
                                c32077q652.f147708a = AbstractC23136l9.m118746s0(AbstractC8020f0.str_btn_see_all_device, Integer.valueOf(optJSONArray2.length()));
                                arrayList.add(c32077q652);
                            }
                            HistoryLoginView.this.m80722EM(i12);
                            HistoryLoginView.this.m80723FM(i13);
                            HistoryLoginView.this.m80724GM(i14);
                            HistoryLoginView.this.m80718AM(arrayList);
                            HistoryLoginView.this.m80719BM(arrayList2);
                            final HistoryLoginView historyLoginView42 = HistoryLoginView.this;
                            historyLoginView42.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.sp
                                @Override // java.lang.Runnable
                                public final void run() {
                                    HistoryLoginView.C14457b.m80742e(HistoryLoginView.this);
                                }
                            });
                            HistoryLoginView.this.m80720CM(false);
                        }
                    } else {
                        i12 = 1;
                        i13 = 0;
                        i14 = 0;
                        arrayList.add(m154730b);
                        HistoryLoginView.this.m80725HM(m154730b);
                        optJSONArray = jSONObject.optJSONArray("logged_in_devices");
                        if (optJSONArray != null) {
                        }
                        JSONObject jSONObject222 = jSONObject.getJSONObject("logged_out_devices");
                        int optInt22 = jSONObject222.optInt("show", 0);
                        optJSONArray2 = jSONObject222.optJSONArray("devices");
                        if (optJSONArray2 != null) {
                        }
                        HistoryLoginView.this.m80722EM(i12);
                        HistoryLoginView.this.m80723FM(i13);
                        HistoryLoginView.this.m80724GM(i14);
                        HistoryLoginView.this.m80718AM(arrayList);
                        HistoryLoginView.this.m80719BM(arrayList2);
                        final HistoryLoginView historyLoginView422 = HistoryLoginView.this;
                        historyLoginView422.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.sp
                            @Override // java.lang.Runnable
                            public final void run() {
                                HistoryLoginView.C14457b.m80742e(HistoryLoginView.this);
                            }
                        });
                        HistoryLoginView.this.m80720CM(false);
                    }
                }
                i12 = 0;
                i13 = 0;
                i14 = 0;
                arrayList.add(m154730b);
                HistoryLoginView.this.m80725HM(m154730b);
                optJSONArray = jSONObject.optJSONArray("logged_in_devices");
                if (optJSONArray != null) {
                }
                JSONObject jSONObject2222 = jSONObject.getJSONObject("logged_out_devices");
                int optInt222 = jSONObject2222.optInt("show", 0);
                optJSONArray2 = jSONObject2222.optJSONArray("devices");
                if (optJSONArray2 != null) {
                }
                HistoryLoginView.this.m80722EM(i12);
                HistoryLoginView.this.m80723FM(i13);
                HistoryLoginView.this.m80724GM(i14);
                HistoryLoginView.this.m80718AM(arrayList);
                HistoryLoginView.this.m80719BM(arrayList2);
                final HistoryLoginView historyLoginView4222 = HistoryLoginView.this;
                historyLoginView4222.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.sp
                    @Override // java.lang.Runnable
                    public final void run() {
                        HistoryLoginView.C14457b.m80742e(HistoryLoginView.this);
                    }
                });
                HistoryLoginView.this.m80720CM(false);
            } catch (Throwable th2) {
                HistoryLoginView.this.m80720CM(false);
                throw th2;
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.HistoryLoginView$c */
    /* loaded from: classes6.dex */
    public static final class C14458c implements InterfaceC20094a {

        /* renamed from: b */
        final /* synthetic */ int f74311b;

        C14458c(int i11) {
            this.f74311b = i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public static final void m80745d(HistoryLoginView historyLoginView, int i11) {
            AbstractC19074t.m100208f(historyLoginView, "this$0");
            if (!historyLoginView.m92677nJ() && !historyLoginView.m92681pJ()) {
                if (i11 != 0 && i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 == 5) {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_device_success));
                                }
                            } else {
                                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_add_device_success));
                            }
                        } else {
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_logout_all_success));
                        }
                    } else {
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_abuse_device_success));
                    }
                } else {
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_logout_success));
                }
                historyLoginView.m80731nM(false);
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            AbstractC19074t.m100208f(c20096c, "error_message");
            HistoryLoginView.this.m80721DM(false);
            HistoryLoginView.this.mo49315c4();
            if (!HistoryLoginView.this.m92677nJ() && !HistoryLoginView.this.m92681pJ()) {
                if (c20096c.m104491c() == 50001) {
                    ToastUtils.showMess(c20096c.m104492d());
                    return;
                }
                int i11 = this.f74311b;
                if (i11 != 0 && i11 != 1) {
                    if (i11 != 2) {
                        if (i11 != 3) {
                            if (i11 != 4) {
                                if (i11 != 5) {
                                    ToastUtils.showMess(c20096c.m104492d());
                                    return;
                                } else {
                                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_remove_device_error));
                                    return;
                                }
                            }
                            ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_add_device_error));
                            return;
                        }
                        ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_logout_all_error));
                        return;
                    }
                    ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_report_abuse_device_error));
                    return;
                }
                ToastUtils.showMess(AbstractC23136l9.m118743r0(AbstractC8020f0.str_logout_error));
            }
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            AbstractC19074t.m100208f(obj, "entity");
            try {
                HistoryLoginView.this.m80721DM(false);
                HistoryLoginView.this.mo49315c4();
                final HistoryLoginView historyLoginView = HistoryLoginView.this;
                final int i11 = this.f74311b;
                historyLoginView.mo70710wy(new Runnable() { // from class: com.zing.zalo.ui.zviews.up
                    @Override // java.lang.Runnable
                    public final void run() {
                        HistoryLoginView.C14458c.m80745d(HistoryLoginView.this, i11);
                    }
                });
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
    }

    /* renamed from: com.zing.zalo.ui.zviews.HistoryLoginView$d */
    /* loaded from: classes6.dex */
    public static final class C14459d extends ZdsActionBar.AbstractC16987c {
        C14459d() {
        }

        @Override // com.zing.zalo.zdesign.component.header.ZdsActionBar.AbstractC16987c
        /* renamed from: a */
        public void mo39913a() {
            super.mo39913a();
            if (HistoryLoginView.this.m80737vM()) {
                HistoryLoginView.this.m80708LM(false);
            } else {
                HistoryLoginView.this.finish();
            }
            AbstractC23647d.m123897g("5811165");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: LM */
    public final void m80708LM(boolean z11) {
        List list;
        this.f74301h1 = z11;
        ZdsActionBar m87077NK = m87077NK();
        if (m87077NK != null) {
            if (this.f74301h1) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_all_logged_out);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
            } else {
                String m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_history_login);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
                m87077NK.setMiddleTitle(m118743r02);
            }
        }
        SwipeRefreshListView swipeRefreshListView = this.f74284Q0;
        if (swipeRefreshListView != null) {
            swipeRefreshListView.setRefreshing(false);
        }
        C7225u2 c7225u2 = this.f74295b1;
        if (c7225u2 != null) {
            if (this.f74301h1) {
                list = this.f74299f1;
            } else {
                list = this.f74298e1;
            }
            AbstractC19074t.m100205c(list);
            c7225u2.m36740O(list);
        }
        m80739zM(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: sM */
    public static final void m80714sM(HistoryLoginView historyLoginView) {
        AbstractC19074t.m100208f(historyLoginView, "this$0");
        historyLoginView.m80731nM(true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: tM */
    public static final void m80715tM(HistoryLoginView historyLoginView) {
        AbstractC19074t.m100208f(historyLoginView, "this$0");
        if (!C23055e5.m118272g(false)) {
            SwipeRefreshListView swipeRefreshListView = historyLoginView.f74284Q0;
            if (swipeRefreshListView != null) {
                swipeRefreshListView.setRefreshing(false);
            }
            SwipeRefreshListView swipeRefreshListView2 = historyLoginView.f74284Q0;
            if (swipeRefreshListView2 != null) {
                swipeRefreshListView2.m88209V();
                return;
            }
            return;
        }
        SwipeRefreshListView swipeRefreshListView3 = historyLoginView.f74284Q0;
        if (swipeRefreshListView3 != null) {
            swipeRefreshListView3.m88202K();
        }
        if (!historyLoginView.f74287T0 && !historyLoginView.f74290W0) {
            historyLoginView.m80731nM(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: xM */
    public static final void m80716xM(HistoryLoginView historyLoginView, InterfaceC17463d interfaceC17463d, int i11) {
        CheckBox checkBox;
        AbstractC19074t.m100208f(historyLoginView, "this$0");
        if (interfaceC17463d != null) {
            interfaceC17463d.dismiss();
        }
        int i12 = historyLoginView.f74294a1;
        if ((i12 == 0 || i12 == 1) && (checkBox = historyLoginView.f74308o1) != null) {
            AbstractC19074t.m100205c(checkBox);
            if (checkBox.isChecked()) {
                historyLoginView.m80738wM(historyLoginView.f74296c1, 1);
                return;
            }
        }
        historyLoginView.m80738wM(historyLoginView.f74296c1, historyLoginView.f74294a1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: yM */
    public static final void m80717yM(HistoryLoginView historyLoginView, View view) {
        AbstractC19074t.m100208f(historyLoginView, "this$0");
        CheckBox checkBox = historyLoginView.f74308o1;
        if (checkBox != null) {
            AbstractC19074t.m100205c(checkBox);
            checkBox.performClick();
        }
    }

    /* renamed from: AM */
    public final void m80718AM(List list) {
        this.f74298e1 = list;
    }

    /* renamed from: BM */
    public final void m80719BM(List list) {
        this.f74299f1 = list;
    }

    /* renamed from: CM */
    public final void m80720CM(boolean z11) {
        this.f74287T0 = z11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: DJ */
    public KeyEventCallbackC17462c mo39014DJ(int i11) {
        String m118743r0;
        SpannableString spannableString;
        String m118743r02;
        Integer num;
        Integer num2;
        String str;
        int m127173b0;
        SpannableString spannableString2;
        if (i11 != this.f74293Z0) {
            return null;
        }
        SpannableString spannableString3 = new SpannableString("");
        int i12 = this.f74294a1;
        int i13 = 7;
        if (i12 != 0 && i12 != 1) {
            if (i12 != 2) {
                if (i12 != 3) {
                    if (i12 != 4) {
                        if (i12 != 5) {
                            spannableString = spannableString3;
                            m118743r0 = "";
                            m118743r02 = m118743r0;
                        } else {
                            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_remove_device);
                            AbstractC19074t.m100207e(m118743r0, "getString(...)");
                            spannableString = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_popup_remove_device));
                            String m118743r03 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_popup_remove_device);
                            AbstractC19074t.m100207e(m118743r03, "getString(...)");
                            m118743r02 = m118743r03;
                            i13 = 4;
                        }
                    } else {
                        C32077q6 c32077q6 = this.f74296c1;
                        if (c32077q6 != null) {
                            num = Integer.valueOf(c32077q6.m154734f());
                        } else {
                            num = null;
                        }
                        if (num != null && num.intValue() == 1 ? this.f74305l1 >= this.f74302i1 : !(num != null && num.intValue() == 2 ? this.f74306m1 < this.f74303j1 : num == null || num.intValue() != 3 || this.f74307n1 < this.f74304k1)) {
                            C32077q6 c32077q62 = this.f74296c1;
                            if (c32077q62 != null) {
                                num2 = Integer.valueOf(c32077q62.m154734f());
                            } else {
                                num2 = null;
                            }
                            if (num2 != null && num2.intValue() == 1) {
                                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_trusted_device_mobile);
                            } else if (num2 != null && num2.intValue() == 2) {
                                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_trusted_device_pc);
                            } else if (num2 == null || num2.intValue() != 3) {
                                str = "";
                            } else {
                                str = AbstractC23136l9.m118743r0(AbstractC8020f0.str_trusted_device_web);
                            }
                            AbstractC19074t.m100205c(str);
                            SpannableString spannableString4 = new SpannableString(AbstractC23136l9.m118746s0(AbstractC8020f0.str_content_popup_limit_trusted_device, str));
                            m127173b0 = AbstractC24342w.m127173b0(spannableString4, str, 0, false, 6, null);
                            if (m127173b0 > 0) {
                                spannableString4.setSpan(new StyleSpan(1), m127173b0, str.length() + m127173b0, 18);
                            }
                            spannableString2 = spannableString4;
                        } else {
                            spannableString2 = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_popup_add_device));
                        }
                        String m118743r04 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_add_device);
                        AbstractC19074t.m100207e(m118743r04, "getString(...)");
                        String m118743r05 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_popup_add_device);
                        AbstractC19074t.m100207e(m118743r05, "getString(...)");
                        m118743r02 = m118743r05;
                        i13 = 4;
                        spannableString = spannableString2;
                        m118743r0 = m118743r04;
                    }
                } else {
                    SpannableString spannableString5 = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_popup_logout_all));
                    String m118743r06 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_popup_logout);
                    AbstractC19074t.m100207e(m118743r06, "getString(...)");
                    m118743r02 = m118743r06;
                    spannableString = spannableString5;
                    m118743r0 = "";
                }
            } else {
                m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_report_abuse);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                spannableString = new SpannableString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_popup_report_abuse));
                m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_popup_report_abuse);
                AbstractC19074t.m100207e(m118743r02, "getString(...)");
            }
        } else {
            m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_title_popup_logout);
            AbstractC19074t.m100207e(m118743r0, "getString(...)");
            spannableString = new SpannableString("");
            m118743r02 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_btn_popup_logout);
            AbstractC19074t.m100207e(m118743r02, "getString(...)");
        }
        C8009j.a aVar = new C8009j.a(m92648SI());
        aVar.m43159h(i13).m43172u(m118743r0).m43162k(spannableString).m43164m(AbstractC8020f0.str_cancel, new InterfaceC17463d.b()).m43170s(m118743r02, new InterfaceC17463d.d() { // from class: com.zing.zalo.ui.zviews.op
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i14) {
                HistoryLoginView.m80716xM(HistoryLoginView.this, interfaceC17463d, i14);
            }
        });
        int i14 = this.f74294a1;
        if (i14 == 0 || i14 == 1) {
            C32077q6 c32077q63 = this.f74296c1;
            if (c32077q63 != null && c32077q63.f147725r == 1) {
                aVar.m43162k(null);
                View inflate = LayoutInflater.from(getContext()).inflate(AbstractC7409c0.checkbox_remove_contact_view, (ViewGroup) null);
                AbstractC19074t.m100207e(inflate, "inflate(...)");
                this.f74308o1 = (CheckBox) inflate.findViewById(AbstractC6918a0.cbRemoveContact);
                ((TextView) inflate.findViewById(AbstractC6918a0.tvRemoveContact)).setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_content_popup_logout));
                inflate.setOnClickListener(new View.OnClickListener() { // from class: com.zing.zalo.ui.zviews.pp
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        HistoryLoginView.m80717yM(HistoryLoginView.this, view);
                    }
                });
                aVar.m43177z(inflate);
            } else {
                aVar.m43172u("");
                aVar.m43162k(m118743r0);
            }
        }
        return aVar.m43152a();
    }

    /* renamed from: DM */
    public final void m80721DM(boolean z11) {
        this.f74290W0 = z11;
    }

    /* renamed from: EM */
    public final void m80722EM(int i11) {
        this.f74305l1 = i11;
    }

    /* renamed from: FM */
    public final void m80723FM(int i11) {
        this.f74306m1 = i11;
    }

    @Override // com.zing.zalo.zview.ZaloView
    /* renamed from: GJ */
    public View mo37483GJ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        AbstractC19074t.m100208f(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(AbstractC7409c0.login_devices_view, viewGroup, false);
        this.f74300g1 = inflate;
        m80736uM(inflate);
        return this.f74300g1;
    }

    /* renamed from: GM */
    public final void m80724GM(int i11) {
        this.f74307n1 = i11;
    }

    /* renamed from: HM */
    public final void m80725HM(C32077q6 c32077q6) {
        this.f74297d1 = c32077q6;
    }

    /* renamed from: IM */
    public final void m80726IM(int i11) {
        this.f74302i1 = i11;
    }

    /* renamed from: JM */
    public final void m80727JM(int i11) {
        this.f74303j1 = i11;
    }

    /* renamed from: KM */
    public final void m80728KM(int i11) {
        this.f74304k1 = i11;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.zing.zalo.p077ui.zviews.ZaloViewNewActionBar
    /* renamed from: OK */
    public void mo39896OK() {
        super.mo39896OK();
        try {
            ZdsActionBar m87077NK = m87077NK();
            if (m87077NK != null) {
                String m118743r0 = AbstractC23136l9.m118743r0(AbstractC8020f0.str_history_login);
                AbstractC19074t.m100207e(m118743r0, "getString(...)");
                m87077NK.setMiddleTitle(m118743r0);
                m87077NK.setLeadingFunctionCallback(new C14459d());
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // com.zing.zalo.adapters.C7225u2.a
    /* renamed from: aA */
    public void mo36741aA() {
        m80708LM(true);
    }

    @Override // com.zing.zalo.adapters.C7225u2.a
    /* renamed from: eA */
    public void mo36742eA() {
        this.f74294a1 = 3;
        this.f74296c1 = this.f74297d1;
        showDialog(this.f74293Z0);
    }

    @Override // ac.InterfaceC0733x
    public String getTrackingKey() {
        return "HistoryLoginView";
    }

    /* renamed from: lM */
    public final List m80729lM() {
        return this.f74298e1;
    }

    /* renamed from: mM */
    public final List m80730mM() {
        return this.f74299f1;
    }

    /* renamed from: nM */
    public final void m80731nM(boolean z11) {
        if (this.f74287T0) {
            return;
        }
        m80739zM(z11);
        this.f74287T0 = true;
        SwipeRefreshListView swipeRefreshListView = this.f74284Q0;
        if (swipeRefreshListView != null) {
            swipeRefreshListView.setRefreshing(true);
        }
        InterfaceC0765j interfaceC0765j = this.f74288U0;
        AbstractC19074t.m100205c(interfaceC0765j);
        interfaceC0765j.mo1704o8(this.f74289V0);
        String str = AbstractC18458a.f93019a;
        InterfaceC0765j interfaceC0765j2 = this.f74288U0;
        AbstractC19074t.m100205c(interfaceC0765j2);
        interfaceC0765j2.mo1764w4(str, 0);
    }

    /* renamed from: oM */
    public final C7225u2 m80732oM() {
        return this.f74295b1;
    }

    @Override // com.zing.zalo.zview.ZaloView
    public void onActivityResult(int i11, int i12, Intent intent) {
        if (i11 == this.f74283P0 && i12 == -1) {
            if (intent != null) {
                try {
                    this.f74294a1 = intent.getIntExtra("EXTRA_ACTION", 0);
                    this.f74296c1 = C32077q6.m154730b(new JSONObject(intent.getStringExtra("EXTRA_BUNDLE_DATA")));
                    showDialog(this.f74293Z0);
                    return;
                } catch (Exception unused) {
                    return;
                }
            }
            return;
        }
        super.onActivityResult(i11, i12, intent);
    }

    @Override // com.zing.zalo.p077ui.zviews.SlidableZaloView, com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    public boolean onKeyUp(int i11, KeyEvent keyEvent) {
        if (i11 == 4) {
            if (this.f74301h1) {
                m80708LM(false);
                return true;
            }
            AbstractC23647d.m123897g("5811165");
        }
        return super.onKeyUp(i11, keyEvent);
    }

    /* renamed from: pM */
    public final MultiStateView m80733pM() {
        return this.f74286S0;
    }

    /* renamed from: qM */
    public final SwipeRefreshListView m80734qM() {
        return this.f74284Q0;
    }

    /* renamed from: rM */
    public final void m80735rM() {
        this.f74295b1 = new C7225u2(this);
        RecyclerView recyclerView = this.f74285R0;
        if (recyclerView != null) {
            recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
            recyclerView.setAdapter(this.f74295b1);
            recyclerView.setVisibility(0);
        }
        this.f74291X0 = new C0766k();
        MultiStateView multiStateView = this.f74286S0;
        if (multiStateView != null) {
            multiStateView.setOnTapToRetryListener(new MultiStateView.InterfaceC15916g() { // from class: com.zing.zalo.ui.zviews.qp
                @Override // com.zing.zalo.p077ui.zviews.multistate.MultiStateView.InterfaceC15916g
                /* renamed from: a */
                public final void mo12138a() {
                    HistoryLoginView.m80714sM(HistoryLoginView.this);
                }
            });
        }
        SwipeRefreshListView swipeRefreshListView = this.f74284Q0;
        if (swipeRefreshListView != null) {
            swipeRefreshListView.setOnRefreshListener(new SwipeRefreshLayout.InterfaceC6891i() { // from class: com.zing.zalo.ui.zviews.rp
                @Override // com.zing.p058v4.widget.SwipeRefreshLayout.InterfaceC6891i
                /* renamed from: a */
                public final void mo12137a() {
                    HistoryLoginView.m80715tM(HistoryLoginView.this);
                }
            });
        }
        this.f74288U0 = new C0766k();
        this.f74289V0 = new C14457b();
        m80731nM(true);
    }

    /* renamed from: uM */
    public final void m80736uM(View view) {
        RecyclerView recyclerView;
        AbstractC19074t.m100205c(view);
        this.f74286S0 = (MultiStateView) view.findViewById(AbstractC6918a0.multi_state);
        SwipeRefreshListView swipeRefreshListView = (SwipeRefreshListView) view.findViewById(AbstractC6918a0.swipe_refresh_layout);
        this.f74284Q0 = swipeRefreshListView;
        if (swipeRefreshListView != null) {
            recyclerView = swipeRefreshListView.f83582p0;
        } else {
            recyclerView = null;
        }
        this.f74285R0 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setBackgroundColor(C23212s8.m119607o(view.getContext(), AbstractC16781w.SecondaryBackgroundColor));
        }
    }

    /* renamed from: vM */
    public final boolean m80737vM() {
        return this.f74301h1;
    }

    @Override // com.zing.zalo.adapters.C7225u2.a
    /* renamed from: vp */
    public void mo36743vp(C32077q6 c32077q6) {
        String str;
        Bundle bundle = new Bundle();
        if (c32077q6 != null) {
            str = c32077q6.f147724q;
        } else {
            str = null;
        }
        bundle.putString("EXTRA_BUNDLE_DATA", str);
        bundle.putInt("EXTRA_BOTTOM_SHEET_TYPE", 26);
        C17487o0 m92662fJ = m92662fJ();
        if (m92662fJ != null) {
            m92662fJ.m93066i2(FrameLayoutKeepBtmSheetZaloView.class, bundle, this.f74283P0, 1, true);
        }
    }

    /* renamed from: wM */
    public final void m80738wM(C32077q6 c32077q6, int i11) {
        if (!this.f74290W0 && c32077q6 != null) {
            this.f74292Y0 = new C14458c(i11);
            this.f74290W0 = true;
            mo46829Y();
            InterfaceC0765j interfaceC0765j = this.f74291X0;
            if (interfaceC0765j != null) {
                interfaceC0765j.mo1704o8(this.f74292Y0);
            }
            InterfaceC0765j interfaceC0765j2 = this.f74291X0;
            if (interfaceC0765j2 != null) {
                interfaceC0765j2.mo1441H3(c32077q6.f147719l, c32077q6.f147709b, 0, i11, c32077q6.f147720m);
            }
        }
    }

    @Override // com.zing.zalo.p077ui.zviews.CommonZaloview, com.zing.zalo.zview.ZaloView
    /* renamed from: xJ */
    public void mo37135xJ(Bundle bundle) {
        super.mo37135xJ(bundle);
        try {
            m80735rM();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: zM */
    public final void m80739zM(boolean z11) {
        try {
            if (z11) {
                SwipeRefreshListView swipeRefreshListView = this.f74284Q0;
                if (swipeRefreshListView != null) {
                    swipeRefreshListView.setVisibility(8);
                }
                MultiStateView multiStateView = this.f74286S0;
                if (multiStateView != null) {
                    multiStateView.setVisibility(0);
                }
                MultiStateView multiStateView2 = this.f74286S0;
                if (multiStateView2 != null) {
                    multiStateView2.setState(MultiStateView.EnumC15914e.LOADING);
                    return;
                }
                return;
            }
            C7225u2 c7225u2 = this.f74295b1;
            if (c7225u2 != null && c7225u2.mo10003k() == 0) {
                SwipeRefreshListView swipeRefreshListView2 = this.f74284Q0;
                if (swipeRefreshListView2 != null) {
                    swipeRefreshListView2.setVisibility(8);
                }
                MultiStateView multiStateView3 = this.f74286S0;
                if (multiStateView3 != null) {
                    multiStateView3.setVisibility(0);
                }
                MultiStateView multiStateView4 = this.f74286S0;
                if (multiStateView4 != null) {
                    multiStateView4.setState(MultiStateView.EnumC15914e.ERROR);
                }
                MultiStateView multiStateView5 = this.f74286S0;
                if (multiStateView5 != null) {
                    multiStateView5.setErrorType(MultiStateView.EnumC15915f.UNKNOWN_ERROR);
                }
                MultiStateView multiStateView6 = this.f74286S0;
                if (multiStateView6 != null) {
                    multiStateView6.setErrorTitleString(AbstractC23136l9.m118743r0(AbstractC8020f0.str_error_loadingList));
                    return;
                }
                return;
            }
            SwipeRefreshListView swipeRefreshListView3 = this.f74284Q0;
            if (swipeRefreshListView3 != null) {
                swipeRefreshListView3.setVisibility(0);
            }
            MultiStateView multiStateView7 = this.f74286S0;
            if (multiStateView7 != null) {
                multiStateView7.setVisibility(8);
            }
            C7225u2 c7225u22 = this.f74295b1;
            if (c7225u22 != null) {
                c7225u22.m10008p();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
