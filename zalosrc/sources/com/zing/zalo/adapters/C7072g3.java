package com.zing.zalo.adapters;

import android.content.Context;
import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC16803z;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.AbstractC8020f0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.contact.ContactNativeItemModuleView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import com.zing.zalo.p077ui.zviews.ZaloListView;
import java.util.ArrayList;
import java.util.List;
import me0.AbstractC23136l9;
import p361nb.AbstractC23647d;

/* renamed from: com.zing.zalo.adapters.g3 */
/* loaded from: classes3.dex */
public class C7072g3 extends RecyclerView.AbstractC1880g {

    /* renamed from: r */
    List f38648r;

    /* renamed from: s */
    boolean f38649s;

    /* renamed from: t */
    a f38650t;

    /* renamed from: u */
    View f38651u;

    /* renamed from: v */
    String f38652v;

    /* renamed from: com.zing.zalo.adapters.g3$a */
    /* loaded from: classes.dex */
    public interface a {
        /* renamed from: E8 */
        void mo36105E8();

        /* renamed from: Yd */
        void mo36106Yd(ContactProfile contactProfile, int i11, boolean z11);

        /* renamed from: zc */
        void mo36107zc(ContactProfile contactProfile, int i11);
    }

    /* renamed from: com.zing.zalo.adapters.g3$b */
    /* loaded from: classes3.dex */
    public class b extends d {

        /* renamed from: I */
        ContactNativeItemModuleView f38653I;

        b(ContactNativeItemModuleView contactNativeItemModuleView, int i11) {
            super(contactNativeItemModuleView, i11);
            this.f38653I = contactNativeItemModuleView;
        }

        @Override // com.zing.zalo.adapters.C7072g3.d
        /* renamed from: i0 */
        void mo36108i0(ContactProfile contactProfile, int i11, int i12, boolean z11) {
            super.mo36108i0(contactProfile, i11, i12, z11);
            this.f38653I.m69712a0(contactProfile, z11, i12);
        }
    }

    /* renamed from: com.zing.zalo.adapters.g3$c */
    /* loaded from: classes3.dex */
    public class c extends d implements View.OnClickListener {

        /* renamed from: I */
        RobotoTextView f38655I;

        /* renamed from: J */
        RobotoTextView f38656J;

        /* renamed from: K */
        RobotoTextView f38657K;

        /* renamed from: L */
        View f38658L;

        /* renamed from: M */
        RobotoTextView f38659M;

        /* renamed from: N */
        ImageView f38660N;

        /* renamed from: O */
        View f38661O;

        c(View view, int i11) {
            super(view, i11);
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4 && i11 != 5) {
                        if (i11 == 7) {
                            this.f38661O = view.findViewById(AbstractC6918a0.separate_line);
                            this.f38660N = (ImageView) view.findViewById(AbstractC6918a0.main_icon_row);
                            return;
                        }
                        return;
                    }
                    this.f38659M = (RobotoTextView) view.findViewById(AbstractC6918a0.txt_description);
                    return;
                }
                this.f38656J = (RobotoTextView) view.findViewById(AbstractC6918a0.title_row);
                this.f38658L = view.findViewById(AbstractC6918a0.separate_line);
                this.f38657K = (RobotoTextView) view.findViewById(AbstractC6918a0.title_contact_row);
                return;
            }
            this.f38655I = (RobotoTextView) view.findViewById(AbstractC6918a0.btn_sync_phonebook);
        }

        @Override // com.zing.zalo.adapters.C7072g3.d
        /* renamed from: i0 */
        void mo36108i0(ContactProfile contactProfile, int i11, int i12, boolean z11) {
            if (i11 != 1) {
                int i13 = 8;
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            if (i11 == 7) {
                                View view = this.f38661O;
                                if (!ZaloListView.m86975fN() && !contactProfile.f42407e1) {
                                    i13 = 0;
                                }
                                view.setVisibility(i13);
                                this.f38660N.setImageResource(AbstractC16803z.ic_favourite_contact_phonebook);
                                this.f38660N.setVisibility(0);
                                return;
                            }
                            return;
                        }
                        this.f38659M.setText(contactProfile.f42437s);
                        return;
                    }
                    this.f38659M.setText(C7072g3.this.f38652v);
                    return;
                }
                this.f38657K.setText(contactProfile.f42437s);
                this.f38657K.setVisibility(0);
                this.f38656J.setVisibility(8);
                View view2 = this.f38658L;
                if (!ZaloListView.m86975fN() && !contactProfile.f42407e1) {
                    i13 = 0;
                }
                view2.setVisibility(i13);
                return;
            }
            this.f38655I.setOnClickListener(this);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            a aVar;
            if (view.getId() == AbstractC6918a0.btn_sync_phonebook && (aVar = C7072g3.this.f38650t) != null) {
                aVar.mo36105E8();
                AbstractC23647d.m123897g("3000212");
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.g3$d */
    /* loaded from: classes3.dex */
    public static class d extends RecyclerView.AbstractC1876c0 {
        d(View view, int i11) {
            super(view);
        }

        /* renamed from: i0 */
        void mo36108i0(ContactProfile contactProfile, int i11, int i12, boolean z11) {
        }
    }

    public C7072g3(View view) {
        this.f38651u = view;
    }

    /* renamed from: L */
    public ContactProfile m36097L(int i11) {
        if (i11 >= 0 && i11 < mo10003k() && mo10005m(i11) == 0) {
            return (ContactProfile) this.f38648r.get(i11);
        }
        return null;
    }

    /* renamed from: M */
    public List m36098M() {
        return this.f38648r;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: N */
    public void mo9990A(d dVar, int i11) {
        boolean z11;
        ContactProfile contactProfile = (ContactProfile) this.f38648r.get(i11);
        int mo10005m = mo10005m(i11);
        if (Build.VERSION.SDK_INT < 24 && this.f38649s) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f38649s = z11;
        dVar.mo36108i0(contactProfile, mo10005m, i11, z11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: O */
    public d mo9992C(ViewGroup viewGroup, int i11) {
        Context context = viewGroup.getContext();
        if (i11 == 1) {
            return new c(LayoutInflater.from(context).inflate(AbstractC7409c0.sync_native_contact_list_row, viewGroup, false), i11);
        }
        if (i11 == 2) {
            return new c(LayoutInflater.from(context).inflate(AbstractC7409c0.item_list_header_row_material, viewGroup, false), i11);
        }
        if (i11 == 3) {
            return new c(LayoutInflater.from(context).inflate(AbstractC7409c0.item_empty_share_view, viewGroup, false), i11);
        }
        if (i11 == 4) {
            return new c(LayoutInflater.from(context).inflate(AbstractC7409c0.item_description_header, viewGroup, false), i11);
        }
        if (i11 == 5) {
            return new c(LayoutInflater.from(context).inflate(AbstractC7409c0.item_description_header, viewGroup, false), i11);
        }
        if (i11 == 6) {
            return new c(LayoutInflater.from(context).inflate(AbstractC7409c0.suggest_phonebook_seperate_line, viewGroup, false), i11);
        }
        if (i11 == 7) {
            return new c(LayoutInflater.from(context).inflate(AbstractC7409c0.item_list_header_row_material_type_icon, viewGroup, false), i11);
        }
        if (i11 == 8) {
            return new c(this.f38651u, i11);
        }
        if (i11 == 9) {
            return new c(LayoutInflater.from(context).inflate(AbstractC7409c0.item_empty_none_friend, viewGroup, false), i11);
        }
        return new b(new ContactNativeItemModuleView(context, this, this.f38650t), i11);
    }

    /* renamed from: P */
    public void m36101P(a aVar) {
        this.f38650t = aVar;
    }

    /* renamed from: Q */
    public void m36102Q(int i11) {
        if (i11 != 1) {
            this.f38652v = AbstractC23136l9.m118743r0(AbstractC8020f0.str_native_list_view_description_all);
        } else {
            this.f38652v = AbstractC23136l9.m118743r0(AbstractC8020f0.str_native_list_view_description);
        }
    }

    /* renamed from: R */
    public void m36103R(boolean z11) {
        this.f38649s = z11;
    }

    /* renamed from: S */
    public void m36104S(List list) {
        if (list != null && !list.isEmpty()) {
            this.f38648r = new ArrayList(list);
            if (ZaloListView.m86975fN()) {
                this.f38648r.add(0, new ContactProfile("-8"));
                return;
            }
            return;
        }
        List list2 = this.f38648r;
        if (list2 != null) {
            list2.clear();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f38648r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        ContactProfile contactProfile = (ContactProfile) this.f38648r.get(i11);
        if (contactProfile != null) {
            if ("-1".equals(contactProfile.f42434r)) {
                return 1;
            }
            if ("-2".equals(contactProfile.f42434r)) {
                return 2;
            }
            if ("-3".equals(contactProfile.f42434r)) {
                return 3;
            }
            if ("-4".equals(contactProfile.f42434r)) {
                return 4;
            }
            if ("-5".equals(contactProfile.f42434r)) {
                return 5;
            }
            if ("-6".equals(contactProfile.f42434r)) {
                return 6;
            }
            if ("-7".equals(contactProfile.f42434r)) {
                return 7;
            }
            if ("-8".equals(contactProfile.f42434r)) {
                return 8;
            }
            if ("-9".equals(contactProfile.f42434r)) {
                return 9;
            }
            return 0;
        }
        return 0;
    }
}
