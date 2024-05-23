package com.zing.zalo.adapters;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import au.AbstractC2379w;
import com.zing.zalo.AbstractC16781w;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.adapters.C7071g2;
import com.zing.zalo.p077ui.widget.EditTextWithContextMenu;
import com.zing.zalo.uicontrol.CustomEditText;
import com.zing.zalo.utils.ToastUtils;
import ed0.AbstractC18391a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import me0.C23212s8;
import mm0.AbstractC23350e;
import p588vw.C28652r;

/* renamed from: com.zing.zalo.adapters.g2 */
/* loaded from: classes3.dex */
public class C7071g2 {

    /* renamed from: a */
    Context f38634a;

    /* renamed from: b */
    LayoutInflater f38635b;

    /* renamed from: c */
    ViewGroup f38636c;

    /* renamed from: d */
    final List f38637d = new ArrayList();

    /* renamed from: e */
    b f38638e;

    /* renamed from: f */
    int f38639f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.zing.zalo.adapters.g2$a */
    /* loaded from: classes3.dex */
    public class a implements View.OnClickListener {

        /* renamed from: p */
        CustomEditText f38640p;

        /* renamed from: q */
        View f38641q;

        /* renamed from: r */
        View f38642r;

        /* renamed from: com.zing.zalo.adapters.g2$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C32699a extends AbstractC18391a {

            /* renamed from: p */
            final /* synthetic */ C7071g2 f38644p;

            C32699a(C7071g2 c7071g2) {
                this.f38644p = c7071g2;
            }

            @Override // ed0.AbstractC18391a, android.text.TextWatcher
            public void afterTextChanged(Editable editable) {
                try {
                    C28652r.m143349v().m143361W(editable);
                    if (a.this.f38640p.getText().length() > 120) {
                        ToastUtils.showMess(String.format(C7071g2.this.f38634a.getString(AbstractC8020f0.str_poll_max_chars_input), 120));
                        a.this.f38640p.setText(a.this.f38640p.getText().toString().substring(0, 120));
                        a.this.f38640p.setSelection(120);
                    }
                    b bVar = C7071g2.this.f38638e;
                    if (bVar != null) {
                        bVar.mo36096c();
                    }
                } catch (Exception e11) {
                    AbstractC23350e.m122778h(e11);
                }
            }
        }

        /* renamed from: com.zing.zalo.adapters.g2$a$b */
        /* loaded from: classes3.dex */
        class b extends EditTextWithContextMenu.AbstractC13498a {

            /* renamed from: a */
            final /* synthetic */ C7071g2 f38646a;

            b(C7071g2 c7071g2) {
                this.f38646a = c7071g2;
            }

            @Override // com.zing.zalo.p077ui.widget.EditTextWithContextMenu.AbstractC13498a
            /* renamed from: a */
            public void mo36093a() {
                String trim = a.this.f38640p.getText().toString().replace("\r\n", " ").replace("\n", " ").trim();
                a.this.f38640p.setText(trim);
                a.this.f38640p.setSelection(trim.length());
            }
        }

        a(String str) {
            View inflate = C7071g2.this.f38635b.inflate(AbstractC7409c0.group_poll_item_creating_option, C7071g2.this.f38636c, false);
            this.f38642r = inflate;
            CustomEditText customEditText = (CustomEditText) inflate.findViewById(AbstractC6918a0.et_group_poll_option);
            this.f38640p = customEditText;
            customEditText.setText(str);
            this.f38640p.addTextChangedListener(new C32699a(C7071g2.this));
            this.f38640p.setTextContextChangeListener(new b(C7071g2.this));
            this.f38640p.setHint(String.format(C7071g2.this.f38634a.getString(AbstractC8020f0.str_poll_option_order), Integer.valueOf(C7071g2.this.m36086d() + 1)));
            this.f38640p.setImeOptions(5);
            this.f38640p.setRawInputType(16384);
            this.f38640p.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: com.zing.zalo.adapters.e2
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i11, KeyEvent keyEvent) {
                    boolean m36091c;
                    m36091c = C7071g2.a.this.m36091c(textView, i11, keyEvent);
                    return m36091c;
                }
            });
            this.f38640p.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: com.zing.zalo.adapters.f2
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    C7071g2.a.this.m36092d(view, z11);
                }
            });
            View findViewById = inflate.findViewById(AbstractC6918a0.btn_remove_option);
            this.f38641q = findViewById;
            findViewById.setOnClickListener(this);
            C7071g2.this.f38636c.addView(inflate);
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: c */
        public /* synthetic */ boolean m36091c(TextView textView, int i11, KeyEvent keyEvent) {
            if (i11 == 5) {
                C7071g2 c7071g2 = C7071g2.this;
                c7071g2.m36085c(c7071g2.m36087e(this) + 1);
                return true;
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: d */
        public /* synthetic */ void m36092d(View view, boolean z11) {
            if (z11) {
                CustomEditText customEditText = this.f38640p;
                customEditText.setSelection(customEditText.getText().length());
                this.f38640p.setHintTextColor(C23212s8.m119607o(C7071g2.this.f38634a, AbstractC16781w.TextColor3_alpha50));
                return;
            }
            this.f38640p.setHintTextColor(C23212s8.m119607o(C7071g2.this.f38634a, AbstractC16781w.TextColor3));
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int size = C7071g2.this.f38637d.size();
            C7071g2 c7071g2 = C7071g2.this;
            if (size <= c7071g2.f38639f) {
                if (this.f38640p.getText().toString().length() > 0) {
                    this.f38640p.setText("");
                    return;
                } else {
                    ToastUtils.showMess(String.format(C7071g2.this.f38634a.getString(AbstractC8020f0.str_poll_min_options_require), Integer.valueOf(C7071g2.this.f38639f)));
                    return;
                }
            }
            c7071g2.f38636c.removeView(this.f38642r);
            C7071g2.this.f38637d.remove(this);
            b bVar = C7071g2.this.f38638e;
            if (bVar != null) {
                bVar.mo36095b();
            }
            int i11 = 0;
            while (i11 < C7071g2.this.f38637d.size()) {
                i11++;
                ((a) C7071g2.this.f38637d.get(i11)).f38640p.setHint(String.format(C7071g2.this.f38634a.getString(AbstractC8020f0.str_poll_option_order), Integer.valueOf(i11)));
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.g2$b */
    /* loaded from: classes3.dex */
    public interface b {
        /* renamed from: a */
        void mo36094a();

        /* renamed from: b */
        void mo36095b();

        /* renamed from: c */
        void mo36096c();
    }

    public C7071g2(Context context, int i11, ViewGroup viewGroup, b bVar) {
        this.f38639f = 2;
        this.f38634a = context;
        this.f38635b = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f38636c = viewGroup;
        this.f38638e = bVar;
        this.f38639f = i11;
        for (int i12 = 0; i12 < this.f38639f; i12++) {
            this.f38637d.add(new a(""));
        }
    }

    /* renamed from: a */
    public void m36083a() {
        this.f38637d.add(new a(""));
        m36085c(this.f38637d.size() - 1);
    }

    /* renamed from: b */
    public void m36084b(ArrayList arrayList) {
        if (arrayList == null) {
            return;
        }
        int min = Math.min(this.f38637d.size(), arrayList.size());
        for (int i11 = 0; i11 < min; i11++) {
            ((a) this.f38637d.get(i11)).f38640p.setText((CharSequence) arrayList.get(i11));
        }
        while (min < arrayList.size()) {
            this.f38637d.add(new a((String) arrayList.get(min)));
            min++;
        }
    }

    /* renamed from: c */
    public void m36085c(int i11) {
        if (i11 < this.f38637d.size()) {
            AbstractC2379w.m12432f(((a) this.f38637d.get(i11)).f38640p);
            return;
        }
        b bVar = this.f38638e;
        if (bVar != null) {
            bVar.mo36094a();
        }
    }

    /* renamed from: d */
    public int m36086d() {
        return this.f38637d.size();
    }

    /* renamed from: e */
    int m36087e(a aVar) {
        for (int i11 = 0; i11 < this.f38637d.size(); i11++) {
            if (this.f38637d.get(i11) == aVar) {
                return i11;
            }
        }
        return -1;
    }

    /* renamed from: f */
    public ArrayList m36088f() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f38637d.iterator();
        while (it.hasNext()) {
            String trim = ((a) it.next()).f38640p.getText().toString().replace("\r\n", " ").replace("\n", " ").trim();
            if (!TextUtils.isEmpty(trim)) {
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        if (((String) it2.next()).equals(trim)) {
                            break;
                        }
                    } else {
                        arrayList.add(trim);
                        break;
                    }
                }
            }
        }
        return arrayList;
    }
}
