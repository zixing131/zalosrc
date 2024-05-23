package com.zing.zalo.p077ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.zing.zalo.AbstractC16775v;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import ge.C19411c;
import ge.C19425q;
import ho0.AbstractC20110a;
import java.util.Calendar;
import me0.AbstractC23136l9;
import me0.AbstractC23160o0;

/* loaded from: classes6.dex */
public class ReminderEventItemView extends FrameLayout {

    /* renamed from: w */
    private static final String[] f69516w = AbstractC23136l9.m118755v0(AbstractC16775v.array_months_short);

    /* renamed from: p */
    View f69517p;

    /* renamed from: q */
    RobotoTextView f69518q;

    /* renamed from: r */
    RobotoTextView f69519r;

    /* renamed from: s */
    RobotoTextView f69520s;

    /* renamed from: t */
    RobotoTextView f69521t;

    /* renamed from: u */
    RobotoTextView f69522u;

    /* renamed from: v */
    RobotoTextView f69523v;

    public ReminderEventItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        m75846b(context);
    }

    /* renamed from: b */
    private void m75846b(Context context) {
        View inflate = View.inflate(context, AbstractC7409c0.reminder_event_item_layout, this);
        this.f69517p = inflate;
        this.f69518q = (RobotoTextView) inflate.findViewById(AbstractC6918a0.tv_month);
        this.f69519r = (RobotoTextView) this.f69517p.findViewById(AbstractC6918a0.tv_day);
        this.f69520s = (RobotoTextView) this.f69517p.findViewById(AbstractC6918a0.tv_title);
        this.f69521t = (RobotoTextView) this.f69517p.findViewById(AbstractC6918a0.tv_sub1);
        this.f69522u = (RobotoTextView) this.f69517p.findViewById(AbstractC6918a0.tv_sub2);
        this.f69523v = (RobotoTextView) this.f69517p.findViewById(AbstractC6918a0.tv_sub3);
    }

    /* renamed from: a */
    public void m75847a(C19411c c19411c) {
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(c19411c.f96262b);
            this.f69518q.setText(f69516w[calendar.get(2)].toUpperCase());
            this.f69519r.setText(calendar.get(5) + "");
            this.f69520s.setText(c19411c.f96286z);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(AbstractC23160o0.m119191F(calendar, true, true));
            if (c19411c.f96266f != 1) {
                sb2.append(" (");
                sb2.append(AbstractC23136l9.m118743r0(AbstractC8020f0.str_at_time));
                sb2.append(" ");
                sb2.append(AbstractC23160o0.m119202K0(c19411c.f96262b, true));
                sb2.append(")");
            }
            this.f69521t.setText(sb2.toString());
            if (c19411c.f96272l == 1) {
                this.f69522u.setVisibility(0);
                this.f69522u.setText("(" + AbstractC23160o0.m119199J(calendar, true, false, false) + ")");
            } else {
                this.f69522u.setVisibility(8);
            }
            C19425q c19425q = new C19425q(c19411c.f96270j, c19411c.f96272l);
            if (c19425q.f96376a != null) {
                this.f69523v.setVisibility(0);
                this.f69523v.setText(c19425q.f96376a.m101571c());
            } else {
                this.f69523v.setVisibility(8);
            }
        } catch (Exception e11) {
            AbstractC20110a.m104539h(e11);
        }
    }

    public ReminderEventItemView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        m75846b(context);
    }
}
