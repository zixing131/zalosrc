package p492rr;

import am.AbstractC0924m0;
import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.View;
import android.widget.TableRow;
import android.widget.TextView;
import bo.C3006m1;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.TrackingSource;
import com.zing.zalo.p077ui.widget.C13718q1;
import com.zing.zalo.uicontrol.Snackbar;
import fn0.AbstractC19074t;
import ge.C19415g;
import java.util.Calendar;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;
import org.json.JSONObject;
import p111du.AbstractC18069a;
import p348mi.AbstractC23309i;
import p716zh.C32002l4;
import p716zh.C32017m4;
import pm0.C24860q;

/* renamed from: rr.p */
/* loaded from: classes4.dex */
public final class C25973p {

    /* renamed from: a */
    public static final C25973p f123927a = new C25973p();

    private C25973p() {
    }

    /* renamed from: d */
    public static /* synthetic */ C24860q m133788d(C25973p c25973p, int i11, long j11, int i12, Object obj) {
        if ((i12 & 2) != 0) {
            j11 = -1;
        }
        return c25973p.m133791c(i11, j11);
    }

    /* renamed from: a */
    public final Calendar m133789a(C19415g c19415g) {
        AbstractC19074t.m100208f(c19415g, "dateInfo");
        Calendar calendar = Calendar.getInstance();
        calendar.set(c19415g.f96330c, c19415g.f96329b, c19415g.f96328a);
        AbstractC19074t.m100205c(calendar);
        return calendar;
    }

    /* renamed from: b */
    public final int m133790b(int i11, long j11) {
        if (i11 == 0) {
            return 1;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                return 5;
            }
        } else {
            long j12 = 60;
            int i12 = (int) ((((j11 / 1000) / j12) / j12) / 24);
            if (i12 != 7) {
                if (i12 != 30) {
                    if (i12 == 180) {
                        return 4;
                    }
                } else {
                    return 3;
                }
            } else {
                return 2;
            }
        }
        return 0;
    }

    /* renamed from: c */
    public final C24860q m133791c(int i11, long j11) {
        int i12 = 1;
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 == 5) {
                            i12 = 2;
                        }
                    } else {
                        j11 = AbstractC23160o0.m119239c(180);
                    }
                } else {
                    j11 = AbstractC23160o0.m119239c(30);
                }
            } else {
                j11 = AbstractC23160o0.m119239c(7);
            }
            return new C24860q(Integer.valueOf(i12), Long.valueOf(j11));
        }
        j11 = -1;
        i12 = 0;
        return new C24860q(Integer.valueOf(i12), Long.valueOf(j11));
    }

    /* renamed from: e */
    public final Snackbar m133792e(View view, View.OnClickListener onClickListener, boolean z11) {
        Snackbar m88030s;
        AbstractC19074t.m100208f(view, "containView");
        AbstractC19074t.m100208f(onClickListener, "callbackListener");
        try {
            if (z11) {
                m88030s = Snackbar.m88017q(view, AbstractC23136l9.m118743r0(AbstractC8020f0.str_setting_saved), -1);
                AbstractC19074t.m100205c(m88030s);
            } else {
                m88030s = Snackbar.m88016p(view, AbstractC8020f0.str_failed_to_save_setting, 0).m88030s(AbstractC23136l9.m118743r0(AbstractC8020f0.str_retry), onClickListener);
                AbstractC19074t.m100205c(m88030s);
            }
            View m88025i = m88030s.m88025i();
            AbstractC19074t.m100207e(m88025i, "getView(...)");
            m88025i.setBackground(AbstractC23136l9.m118665N(m88025i.getContext(), AbstractC16803z.limit_feed_visible_result_snackbar_background));
            View findViewById = m88025i.findViewById(AbstractC6918a0.snackbar_text);
            AbstractC19074t.m100206d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView = (TextView) findViewById;
            textView.setTextColor(Color.parseColor("#FFFFFF"));
            textView.setTextSize(0, AbstractC23136l9.m118742r(15.0f));
            View findViewById2 = m88025i.findViewById(AbstractC6918a0.snackbar_action);
            AbstractC19074t.m100206d(findViewById2, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView2 = (TextView) findViewById2;
            TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, AbstractC23136l9.m118742r(26.0f));
            layoutParams.gravity = 8388629;
            textView2.setLayoutParams(layoutParams);
            textView2.setGravity(17);
            textView2.setTextSize(0, AbstractC23136l9.m118742r(15.0f));
            textView2.setTextColor(Color.parseColor("#4C9DFF"));
            textView2.setPadding(0, 0, 0, 0);
            textView2.setMinWidth(AbstractC23136l9.m118742r(70.0f));
            if (AbstractC23309i.m122089kb() == 0) {
                Context context = textView.getContext();
                AbstractC19074t.m100207e(context, "getContext(...)");
                Typeface m76694c = C13718q1.m76694c(context, 5);
                if (m76694c != null) {
                    textView.setTypeface(m76694c);
                    textView2.setTypeface(m76694c);
                }
            }
            if (z11) {
                textView.setCompoundDrawablesRelativeWithIntrinsicBounds(AbstractC16803z.ic_check_line_24, 0, 0, 0);
                textView.setCompoundDrawablePadding(AbstractC23136l9.m118742r(12.0f));
            }
            return m88030s;
        } catch (Exception e11) {
            e11.printStackTrace();
            return null;
        }
    }

    /* renamed from: f */
    public final String m133793f(C32002l4 c32002l4) {
        AbstractC19074t.m100208f(c32002l4, "entryPointChain");
        try {
            TrackingSource m154349X = C32017m4.m154326S().m154349X(c32002l4);
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("srcType", m154349X.m40683t());
            String jSONObject2 = jSONObject.toString();
            AbstractC19074t.m100205c(jSONObject2);
            return jSONObject2;
        } catch (Exception e11) {
            e11.printStackTrace();
            return "";
        }
    }

    /* renamed from: g */
    public final boolean m133794g(JSONObject jSONObject) {
        if (jSONObject != null) {
            try {
                if (jSONObject.has("limit_visible_feed_value")) {
                    if (AbstractC18069a.m96086e(jSONObject, "limit_visible_feed_value", 0) == 0) {
                        return false;
                    }
                    return true;
                }
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        }
        return false;
    }

    /* renamed from: h */
    public final C3006m1 m133795h() {
        C3006m1 c3006m1;
        try {
            String m3679b3 = AbstractC0924m0.m3679b3();
            if (m3679b3 != null && m3679b3.length() != 0) {
                c3006m1 = new C3006m1(new JSONObject(m3679b3));
                return c3006m1;
            }
            c3006m1 = new C3006m1();
            return c3006m1;
        } catch (Exception unused) {
            return new C3006m1();
        }
    }

    /* renamed from: i */
    public final void m133796i(C3006m1 c3006m1) {
        AbstractC19074t.m100208f(c3006m1, "limitFeedVisibleProfileRemindData");
        AbstractC0924m0.m3636Zj(c3006m1.m14417h().toString());
    }
}
