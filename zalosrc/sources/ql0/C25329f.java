package ql0;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TableLayout;
import android.widget.TextView;
import com.zing.zalo.zplayer.C17395R;

/* renamed from: ql0.f */
/* loaded from: classes7.dex */
public class C25329f {

    /* renamed from: a */
    private Context f121504a;

    /* renamed from: b */
    public ViewGroup f121505b;

    /* renamed from: c */
    public TableLayout f121506c;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ql0.f$a */
    /* loaded from: classes7.dex */
    public static class a {

        /* renamed from: a */
        public TextView f121507a;

        /* renamed from: b */
        public TextView f121508b;

        private a() {
        }

        /* renamed from: a */
        public void m131169a(String str) {
            TextView textView = this.f121507a;
            if (textView != null) {
                textView.setText(str);
            }
        }

        /* renamed from: b */
        public void m131170b(String str) {
            TextView textView = this.f121508b;
            if (textView != null) {
                textView.setText(str);
            }
        }
    }

    public C25329f(Context context, TableLayout tableLayout) {
        this.f121504a = context;
        this.f121505b = tableLayout;
        this.f121506c = tableLayout;
    }

    /* renamed from: a */
    public View m131163a(int i11, String str, String str2) {
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.f121504a).inflate(i11, (ViewGroup) this.f121506c, false);
        m131167e(viewGroup, str, str2);
        this.f121506c.addView(viewGroup);
        return viewGroup;
    }

    /* renamed from: b */
    public View m131164b(int i11, String str) {
        return m131165c(this.f121504a.getString(i11), str);
    }

    /* renamed from: c */
    public View m131165c(String str, String str2) {
        return m131163a(C17395R.layout.table_media_info_row2, str, str2);
    }

    /* renamed from: d */
    public a m131166d(View view) {
        a aVar = (a) view.getTag();
        if (aVar == null) {
            a aVar2 = new a();
            aVar2.f121507a = (TextView) view.findViewById(C17395R.id.name);
            aVar2.f121508b = (TextView) view.findViewById(C17395R.id.value);
            view.setTag(aVar2);
            return aVar2;
        }
        return aVar;
    }

    /* renamed from: e */
    public void m131167e(View view, String str, String str2) {
        a m131166d = m131166d(view);
        m131166d.m131169a(str);
        m131166d.m131170b(str2);
    }

    /* renamed from: f */
    public void m131168f(View view, String str) {
        m131166d(view).m131170b(str);
    }
}
