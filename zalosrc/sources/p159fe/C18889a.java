package p159fe;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import com.zing.zalo.AbstractC16801x;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import me0.C23212s8;
import p262jb.AbstractC21196a;

/* renamed from: fe.a */
/* loaded from: classes3.dex */
public class C18889a extends BaseAdapter {

    /* renamed from: p */
    Context f94298p;

    /* renamed from: q */
    private final List f94299q = new ArrayList();

    /* renamed from: r */
    private int f94300r = AbstractC23136l9.m118742r(12.0f);

    /* renamed from: s */
    int f94301s = 0;

    /* renamed from: t */
    boolean f94302t = false;

    /* renamed from: u */
    LayoutInflater f94303u = null;

    /* renamed from: fe.a$a */
    /* loaded from: classes3.dex */
    public static class a {

        /* renamed from: a */
        private RobotoTextView f94304a;

        /* renamed from: b */
        private ImageView f94305b;

        /* renamed from: c */
        private ImageView f94306c;

        /* renamed from: d */
        private View f94307d;
    }

    public C18889a(Context context) {
        this.f94298p = context;
        m99032b();
    }

    /* renamed from: b */
    private void m99032b() {
        this.f94299q.clear();
        this.f94299q.add(1);
        this.f94299q.add(2);
    }

    @Override // android.widget.Adapter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i11) {
        return (Integer) this.f94299q.get(i11);
    }

    /* renamed from: c */
    public void m99034c(int i11) {
        this.f94301s = i11;
    }

    /* renamed from: d */
    public void m99035d(boolean z11) {
        this.f94302t = z11;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f94299q.size();
    }

    @Override // android.widget.Adapter
    public long getItemId(int i11) {
        return i11;
    }

    @Override // android.widget.Adapter
    public View getView(int i11, View view, ViewGroup viewGroup) {
        a aVar;
        int intValue = getItem(i11).intValue();
        if (view == null) {
            if (this.f94303u == null) {
                this.f94303u = LayoutInflater.from(this.f94298p);
            }
            view = this.f94303u.inflate(AbstractC7409c0.item_with_checked_icn_layout, viewGroup, false);
            aVar = new a();
            aVar.f94304a = (RobotoTextView) view.findViewById(AbstractC6918a0.item_title);
            aVar.f94305b = (ImageView) view.findViewById(AbstractC6918a0.ic_reply);
            aVar.f94306c = (ImageView) view.findViewById(AbstractC6918a0.radio_btn);
            aVar.f94307d = view.findViewById(AbstractC6918a0.process_loading);
            view.setTag(aVar);
        } else {
            aVar = (a) view.getTag();
        }
        if (intValue != 1) {
            if (intValue != 2) {
                return null;
            }
            aVar.f94304a.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_decline));
            aVar.f94305b.setImageDrawable(AbstractC23136l9.m118665N(this.f94298p, AbstractC16803z.ic_reply_decline));
        } else {
            aVar.f94304a.setText(AbstractC23136l9.m118743r0(AbstractC8020f0.str_attend_event_accept));
            aVar.f94305b.setImageDrawable(AbstractC23136l9.m118665N(this.f94298p, AbstractC16803z.ic_reply_going));
        }
        if (this.f94302t) {
            aVar.f94304a.setTextColor(C23212s8.m119607o(this.f94298p, AbstractC21196a.TextColor2));
            view.setBackgroundColor(AbstractC23136l9.m118641B(this.f94298p, AbstractC16801x.transparent));
            if (intValue == this.f94301s) {
                aVar.f94307d.setVisibility(0);
                aVar.f94306c.setVisibility(8);
            } else {
                aVar.f94307d.setVisibility(8);
                aVar.f94306c.setVisibility(0);
            }
        } else {
            aVar.f94304a.setTextColor(C23212s8.m119607o(this.f94298p, AbstractC21196a.TextColor1));
            aVar.f94307d.setVisibility(8);
            if (intValue == this.f94301s) {
                aVar.f94306c.setVisibility(0);
                aVar.f94306c.setImageDrawable(AbstractC23136l9.m118665N(this.f94298p, AbstractC16803z.ic_checked_radio_btn));
            } else {
                aVar.f94306c.setVisibility(0);
                aVar.f94306c.setImageDrawable(AbstractC23136l9.m118665N(this.f94298p, AbstractC16803z.ic_unchecked_radio_btn));
            }
        }
        return view;
    }
}
