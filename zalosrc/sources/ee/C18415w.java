package ee;

import ae.C0766k;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.dialog.C8009j;
import com.zing.zalo.p077ui.zviews.AttendConfirmBottomPicker;
import com.zing.zalo.p077ui.zviews.BaseZaloView;
import com.zing.zalo.p077ui.zviews.GroupEventDetailView;
import com.zing.zalo.p077ui.zviews.GroupPostDetailViewV2;
import com.zing.zalo.utils.ToastUtils;
import com.zing.zalo.zview.ZaloView;
import com.zing.zalo.zview.dialog.InterfaceC17463d;
import com.zing.zalocore.CoreUtility;
import ee.C18415w;
import ge.C19409a;
import ge.C19411c;
import ge.C19417i;
import ge.C19426r;
import hm0.C20096c;
import hm0.InterfaceC20094a;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.TimeZone;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import mm0.AbstractC23350e;
import org.json.JSONArray;
import org.json.JSONObject;
import p361nb.AbstractC23647d;
import p542ub.InterfaceC27218a;

/* renamed from: ee.w */
/* loaded from: classes3.dex */
public class C18415w {

    /* renamed from: d */
    static boolean f92866d = false;

    /* renamed from: a */
    private AttendConfirmBottomPicker f92867a;

    /* renamed from: b */
    private int f92868b;

    /* renamed from: c */
    boolean f92869c = false;

    /* renamed from: ee.w$a */
    /* loaded from: classes3.dex */
    public class a implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ InterfaceC20094a f92870a;

        /* renamed from: b */
        final /* synthetic */ ZaloView f92871b;

        a(InterfaceC20094a interfaceC20094a, ZaloView zaloView) {
            this.f92870a = interfaceC20094a;
            this.f92871b = zaloView;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            ((BaseZaloView) this.f92871b).mo49315c4();
            C18415w.f92866d = false;
            this.f92870a.mo926a(c20096c);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            try {
                this.f92870a.mo927b(obj);
                ((BaseZaloView) this.f92871b).mo49315c4();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C18415w.f92866d = false;
        }
    }

    /* renamed from: ee.w$b */
    /* loaded from: classes3.dex */
    public class b implements InterfaceC20094a {

        /* renamed from: a */
        final /* synthetic */ C19411c f92872a;

        /* renamed from: b */
        final /* synthetic */ int f92873b;

        /* renamed from: c */
        final /* synthetic */ ZaloView f92874c;

        b(C19411c c19411c, int i11, ZaloView zaloView) {
            this.f92872a = c19411c;
            this.f92873b = i11;
            this.f92874c = zaloView;
        }

        /* renamed from: e */
        public /* synthetic */ void m97605e(ZaloView zaloView) {
            C18415w.this.m97600c(zaloView);
        }

        /* renamed from: f */
        public /* synthetic */ void m97606f(ZaloView zaloView) {
            C18415w.this.m97600c(zaloView);
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: a */
        public void mo926a(C20096c c20096c) {
            if (c20096c != null) {
                try {
                    String m104492d = c20096c.m104492d();
                    if (!TextUtils.isEmpty(m104492d)) {
                        ToastUtils.showMess(m104492d);
                    }
                } catch (Exception e11) {
                    e11.printStackTrace();
                }
            }
            C18408p.m97474Q().f92822a.remove(this.f92872a.f96261a);
            if (this.f92874c.m92676n2() != null) {
                this.f92874c.m92676n2().runOnUiThread(new Runnable() { // from class: ee.y

                    /* renamed from: q */
                    public final /* synthetic */ ZaloView f92879q;

                    public /* synthetic */ RunnableC18417y(ZaloView zaloView) {
                        r2 = zaloView;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C18415w.b.this.m97606f(r2);
                    }
                });
            }
            C18415w.this.f92869c = false;
        }

        @Override // hm0.InterfaceC20094a
        /* renamed from: b */
        public void mo927b(Object obj) {
            C19409a c19409a;
            try {
                JSONObject optJSONObject = ((JSONObject) obj).optJSONObject("data");
                if (optJSONObject != null && (c19409a = this.f92872a.f96285y) != null) {
                    c19409a.f96250b = this.f92873b;
                    JSONArray optJSONArray = optJSONObject.optJSONArray("responseInfo");
                    if (optJSONArray != null) {
                        this.f92872a.f96285y.f96251c = new ArrayList();
                        for (int i11 = 0; i11 < optJSONArray.length(); i11++) {
                            JSONObject optJSONObject2 = optJSONArray.optJSONObject(i11);
                            if (optJSONObject2 != null) {
                                this.f92872a.f96285y.f96251c.add(new C19417i(optJSONObject2));
                            }
                        }
                    }
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
            C18408p.m97474Q().f92822a.remove(this.f92872a.f96261a);
            if (this.f92874c.m92676n2() != null) {
                this.f92874c.m92676n2().runOnUiThread(new Runnable() { // from class: ee.x

                    /* renamed from: q */
                    public final /* synthetic */ ZaloView f92877q;

                    public /* synthetic */ RunnableC18416x(ZaloView zaloView) {
                        r2 = zaloView;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        C18415w.b.this.m97605e(r2);
                    }
                });
            }
            C18415w.this.f92869c = false;
        }
    }

    /* renamed from: e */
    public static ArrayList m97592e(List list) {
        ArrayList arrayList = new ArrayList(list);
        try {
            ArrayList arrayList2 = new ArrayList();
            Calendar calendar = Calendar.getInstance();
            Calendar calendar2 = Calendar.getInstance();
            Calendar calendar3 = Calendar.getInstance(C18408p.m97471K());
            TimeZone timeZone = TimeZone.getDefault();
            int m119252g0 = AbstractC23160o0.m119252g0(C18408p.m97471K(), timeZone);
            int i11 = 0;
            while (i11 < arrayList.size()) {
                C19411c c19411c = (C19411c) arrayList.get(i11);
                if (timeZone.useDaylightTime()) {
                    m119252g0 = AbstractC23160o0.m119255h0(C18408p.m97471K(), timeZone, c19411c.f96262b);
                }
                if (c19411c.f96266f == 1) {
                    C19411c c19411c2 = new C19411c(c19411c.mo101533h());
                    c19411c2.f96260B = c19411c.f96260B;
                    arrayList.remove(i11);
                    i11--;
                    long j11 = m119252g0;
                    c19411c2.f96262b += j11;
                    c19411c2.f96263c += j11;
                    arrayList2.add(c19411c2);
                } else if (c19411c.m101530e() == 2) {
                    int i12 = c19411c.f96260B;
                    if (i12 != 0) {
                        if (i12 != 1) {
                            if (i12 == 2) {
                                C19411c c19411c3 = new C19411c(c19411c.mo101533h());
                                c19411c3.f96260B = c19411c.f96260B;
                                arrayList.remove(i11);
                                i11--;
                                calendar.setTimeInMillis(c19411c.f96263c);
                                calendar3.setTimeInMillis(c19411c.f96263c);
                                if (AbstractC23160o0.m119233a(calendar, calendar3) != 0) {
                                    AbstractC23160o0.m119301w1(calendar);
                                    c19411c3.f96262b = calendar.getTimeInMillis();
                                } else {
                                    c19411c3.f96262b += m119252g0;
                                }
                                arrayList2.add(c19411c3);
                            }
                        } else {
                            C19411c c19411c4 = new C19411c(c19411c.mo101533h());
                            c19411c4.f96260B = c19411c.f96260B;
                            arrayList.remove(i11);
                            i11--;
                            long j12 = m119252g0;
                            long j13 = c19411c4.f96262b + j12;
                            c19411c4.f96262b = j13;
                            c19411c4.f96263c += j12;
                            calendar.setTimeInMillis(j13);
                            calendar2.setTimeInMillis(c19411c4.f96264d);
                            if (AbstractC23160o0.m119233a(calendar, calendar2) != 0) {
                                calendar2.setTimeInMillis(c19411c4.f96265e);
                                if (AbstractC23160o0.m119233a(calendar, calendar2) != 0) {
                                    arrayList2.add(c19411c4);
                                }
                            }
                        }
                    } else {
                        C19411c c19411c5 = new C19411c(c19411c.mo101533h());
                        c19411c5.f96260B = c19411c.f96260B;
                        arrayList.remove(i11);
                        i11--;
                        calendar.setTimeInMillis(c19411c.f96262b);
                        calendar3.setTimeInMillis(c19411c.f96262b);
                        if (AbstractC23160o0.m119233a(calendar, calendar3) != 0) {
                            AbstractC23160o0.m119301w1(calendar);
                            calendar.add(5, 1);
                            c19411c5.f96263c = calendar.getTimeInMillis() - 1;
                        } else {
                            c19411c5.f96263c += m119252g0;
                        }
                        arrayList2.add(c19411c5);
                    }
                }
                i11++;
            }
            arrayList.addAll(arrayList2);
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
        }
        return arrayList;
    }

    /* renamed from: f */
    public static C8009j m97593f(Context context) {
        C8009j.a aVar = new C8009j.a(context);
        aVar.m43160i(new String[]{AbstractC23136l9.m118743r0(AbstractC8020f0.context_item_1_hour), AbstractC23136l9.m118743r0(AbstractC8020f0.context_item_4_hours), AbstractC23136l9.m118743r0(AbstractC8020f0.context_item_8_AM)}, new InterfaceC17463d.d() { // from class: ee.u
            @Override // com.zing.zalo.zview.dialog.InterfaceC17463d.d
            /* renamed from: K8 */
            public final void mo605K8(InterfaceC17463d interfaceC17463d, int i11) {
                C18415w.m97596i(interfaceC17463d, i11);
            }
        });
        aVar.m43172u(AbstractC23136l9.m118743r0(AbstractC8020f0.str_hide_calendar_thread_title_dlg));
        aVar.m43173v(100);
        return aVar.m43152a();
    }

    /* renamed from: g */
    public static void m97594g(ZaloView zaloView, String str, InterfaceC20094a interfaceC20094a) {
        if (f92866d) {
            return;
        }
        f92866d = true;
        ((BaseZaloView) zaloView).mo46829Y();
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new a(interfaceC20094a, zaloView));
        c0766k.mo1646g9(str);
    }

    /* renamed from: h */
    public static boolean m97595h(C19411c c19411c) {
        if (c19411c == null) {
            return false;
        }
        try {
            InviteContactProfile inviteContactProfile = c19411c.f96275o;
            if (inviteContactProfile == null) {
                return false;
            }
            if (!CoreUtility.f89233i.equals(inviteContactProfile.f42434r)) {
                return false;
            }
            return true;
        } catch (Exception e11) {
            AbstractC23350e.m122778h(e11);
            return false;
        }
    }

    /* renamed from: i */
    public static /* synthetic */ void m97596i(InterfaceC17463d interfaceC17463d, int i11) {
        long j11;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    j11 = 0;
                } else {
                    Calendar calendar = Calendar.getInstance();
                    long timeInMillis = calendar.getTimeInMillis();
                    if (calendar.get(11) >= 8) {
                        calendar.add(6, 1);
                    }
                    calendar.set(11, 8);
                    calendar.set(12, 0);
                    calendar.set(13, 0);
                    j11 = calendar.getTimeInMillis() - timeInMillis;
                }
            } else {
                j11 = 14400000;
            }
        } else {
            j11 = 3600000;
        }
        C18408p.m97474Q().m97522b0(System.currentTimeMillis(), j11);
    }

    /* renamed from: j */
    public /* synthetic */ void m97597j(C19411c c19411c, ZaloView zaloView, String str, int i11) {
        this.f92868b = i11;
        this.f92867a.m78110vL(i11, false);
        this.f92867a.m78105EG(true, true);
        m97601d(c19411c, this.f92868b, zaloView, str);
    }

    /* renamed from: k */
    public static void m97598k(InterfaceC27218a interfaceC27218a, C19411c c19411c, boolean z11) {
        if (interfaceC27218a != null && c19411c != null) {
            try {
                int i11 = c19411c.f96279s;
                if (i11 != 1) {
                    if (i11 == 2) {
                        AbstractC23647d.m123897g("77700022");
                    }
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_event_id", c19411c.f96261a);
                    if (c19411c.f96277q == 2 && !TextUtils.isEmpty(c19411c.f96278r)) {
                        bundle.putString("extra_group_id", c19411c.f96278r);
                    }
                    bundle.putLong("LONG_EXTRA_EVENT_START_TIME", c19411c.f96262b);
                    bundle.putBoolean("extra_shortcut_csc", true);
                    bundle.putBoolean("extra_shortcut_calendar", z11);
                    interfaceC27218a.mo35579p().m93069k2(GroupEventDetailView.class, bundle, 1, true);
                    return;
                }
                AbstractC23647d.m123897g("77700021");
                C19411c.a aVar = c19411c.f96281u;
                if (aVar != null && !TextUtils.isEmpty(aVar.f96287a)) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("extra_topic_id", c19411c.f96281u.f96287a);
                    bundle2.putString("extra_group_id", c19411c.f96278r);
                    bundle2.putLong("LONG_EXTRA_EVENT_START_TIME", c19411c.f96262b);
                    bundle2.putLong("LONG_EXTRA_EVENT_END_TIME", c19411c.f96263c);
                    bundle2.putBoolean("extra_shortcut_csc", true);
                    bundle2.putBoolean("extra_shortcut_groupboard", z11);
                    interfaceC27218a.mo35579p().m93069k2(GroupPostDetailViewV2.class, bundle2, 1, true);
                }
            } catch (Exception e11) {
                AbstractC23350e.m122778h(e11);
            }
        }
    }

    /* renamed from: l */
    public static ArrayList m97599l(ArrayList arrayList, long j11, long j12) {
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C19411c c19411c = (C19411c) it.next();
            int i11 = c19411c.f96260B;
            if (i11 != 1 && i11 != 2) {
                long j13 = c19411c.f96262b;
                if (j13 >= j11 - 864000000 && j13 <= 864000000 + j12 && c19411c.f96269i != null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < c19411c.f96269i.length) {
                            long j14 = c19411c.f96262b - (r3[i12] * 60000);
                            if (j14 >= j11 && j14 <= j12) {
                                arrayList2.add(new C19426r(c19411c, j14));
                            }
                            i12++;
                        }
                    }
                }
            }
        }
        return arrayList2;
    }

    /* renamed from: c */
    void m97600c(ZaloView zaloView) {
        try {
            AttendConfirmBottomPicker attendConfirmBottomPicker = this.f92867a;
            if (attendConfirmBottomPicker != null) {
                attendConfirmBottomPicker.dismiss();
            } else {
                ZaloView m92996E0 = zaloView.m92649TI().m92996E0("RepeatTypeBottomPicker");
                if (m92996E0 != null) {
                    zaloView.m92649TI().mo92702G1(m92996E0, m92996E0.f88756W);
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d */
    public void m97601d(C19411c c19411c, int i11, ZaloView zaloView, String str) {
        if (c19411c == null || TextUtils.isEmpty(c19411c.f96261a) || this.f92869c) {
            return;
        }
        this.f92869c = true;
        C18408p.m97474Q().f92822a.put(c19411c.f96261a, Integer.valueOf(i11));
        C0766k c0766k = new C0766k();
        c0766k.mo1704o8(new b(c19411c, i11, zaloView));
        C18408p.m97474Q().f92823b.add(c19411c.f96261a);
        c0766k.mo1512Pa(Long.parseLong(c19411c.f96261a), i11, str);
    }

    /* renamed from: m */
    public void m97602m(ZaloView zaloView, C19411c c19411c, String str) {
        if (c19411c == null) {
            return;
        }
        try {
            this.f92867a = AttendConfirmBottomPicker.m78104tL(c19411c.f96285y.f96250b, new AttendConfirmBottomPicker.InterfaceC14036a() { // from class: ee.v

                /* renamed from: b */
                public final /* synthetic */ C19411c f92863b;

                /* renamed from: c */
                public final /* synthetic */ ZaloView f92864c;

                /* renamed from: d */
                public final /* synthetic */ String f92865d;

                public /* synthetic */ C18414v(C19411c c19411c2, ZaloView zaloView2, String str2) {
                    r2 = c19411c2;
                    r3 = zaloView2;
                    r4 = str2;
                }

                @Override // com.zing.zalo.p077ui.zviews.AttendConfirmBottomPicker.InterfaceC14036a
                /* renamed from: g */
                public final void mo78111g(int i11) {
                    C18415w.this.m97597j(r2, r3, r4, i11);
                }
            });
            zaloView2.m92649TI().m93060e2(0, this.f92867a, "ListViewBottomPicker", 0, false);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }
}
