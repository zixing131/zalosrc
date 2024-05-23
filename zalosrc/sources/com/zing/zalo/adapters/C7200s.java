package com.zing.zalo.adapters;

import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.zing.zalo.AbstractC6918a0;
import com.zing.zalo.AbstractC7409c0;
import com.zing.zalo.control.ContactProfile;
import com.zing.zalo.p077ui.moduleview.contact.DeletePhoneBookFriendModuleView;
import com.zing.zalo.p077ui.widget.RobotoTextView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p361nb.AbstractC23647d;

/* renamed from: com.zing.zalo.adapters.s */
/* loaded from: classes3.dex */
public class C7200s extends RecyclerView.AbstractC1880g {

    /* renamed from: t */
    private final a f39453t;

    /* renamed from: v */
    private String f39455v;

    /* renamed from: w */
    private String f39456w;

    /* renamed from: r */
    private List f39451r = new ArrayList();

    /* renamed from: s */
    private boolean f39452s = false;

    /* renamed from: u */
    private final HashMap f39454u = new HashMap();

    /* renamed from: x */
    private boolean f39457x = false;

    /* renamed from: com.zing.zalo.adapters.s$a */
    /* loaded from: classes3.dex */
    public interface a {
        /* renamed from: Sj */
        void mo36644Sj(ContactProfile contactProfile);
    }

    /* renamed from: com.zing.zalo.adapters.s$b */
    /* loaded from: classes3.dex */
    public static class b extends d {

        /* renamed from: I */
        DeletePhoneBookFriendModuleView f39458I;

        public b(DeletePhoneBookFriendModuleView deletePhoneBookFriendModuleView) {
            super(deletePhoneBookFriendModuleView);
            this.f39458I = deletePhoneBookFriendModuleView;
        }

        @Override // com.zing.zalo.adapters.C7200s.d
        /* renamed from: i0 */
        void mo36645i0(ContactProfile contactProfile, int i11, int i12, boolean z11) {
            super.mo36645i0(contactProfile, i11, i12, z11);
            this.f39458I.m69717W(contactProfile, z11, i12);
        }
    }

    /* renamed from: com.zing.zalo.adapters.s$c */
    /* loaded from: classes3.dex */
    public class c extends d {

        /* renamed from: I */
        RobotoTextView f39459I;

        /* renamed from: J */
        RobotoTextView f39460J;

        public c(View view, int i11) {
            super(view);
            if (i11 == -1) {
                this.f39459I = (RobotoTextView) view.findViewById(AbstractC6918a0.txt_description_primary);
                this.f39460J = (RobotoTextView) view.findViewById(AbstractC6918a0.txt_description_secondary);
            }
        }

        @Override // com.zing.zalo.adapters.C7200s.d
        /* renamed from: i0 */
        void mo36645i0(ContactProfile contactProfile, int i11, int i12, boolean z11) {
            if (i11 == -1) {
                if (!TextUtils.isEmpty(C7200s.this.f39455v)) {
                    this.f39459I.setText(C7200s.this.f39455v);
                    this.f39459I.setVisibility(0);
                } else {
                    this.f39459I.setVisibility(8);
                }
                if (!TextUtils.isEmpty(C7200s.this.f39456w)) {
                    this.f39460J.setText(C7200s.this.f39456w);
                    this.f39460J.setVisibility(0);
                } else {
                    this.f39460J.setVisibility(8);
                }
            }
        }
    }

    /* renamed from: com.zing.zalo.adapters.s$d */
    /* loaded from: classes3.dex */
    public static class d extends RecyclerView.AbstractC1876c0 {
        public d(View view) {
            super(view);
        }

        /* renamed from: i0 */
        void mo36645i0(ContactProfile contactProfile, int i11, int i12, boolean z11) {
        }
    }

    public C7200s(a aVar) {
        this.f39453t = aVar;
    }

    /* renamed from: O */
    private void m36627O() {
        try {
            if (m36634U() && this.f39454u.size() > 0) {
                HashSet hashSet = new HashSet(this.f39454u.size());
                int mo10003k = mo10003k();
                for (int i11 = 0; i11 < mo10003k; i11++) {
                    ContactProfile m36630Q = m36630Q(i11);
                    if (m36630Q != null && this.f39454u.containsKey(m36630Q.f42434r)) {
                        hashSet.add(m36630Q.f42434r);
                    }
                }
                Iterator it = this.f39454u.keySet().iterator();
                while (it.hasNext()) {
                    if (!hashSet.contains((String) it.next())) {
                        it.remove();
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: N */
    public void m36628N() {
        this.f39454u.clear();
        this.f39457x = false;
        m10008p();
    }

    /* renamed from: P */
    public int m36629P(Map map) {
        ContactProfile contactProfile;
        if (map != null) {
            map.clear();
        }
        int mo10003k = mo10003k();
        int i11 = 0;
        for (int i12 = 0; i12 < mo10003k; i12++) {
            if (m36633T(i12) && (contactProfile = (ContactProfile) this.f39451r.get(i12)) != null && !TextUtils.isEmpty(contactProfile.f42434r)) {
                i11++;
                if (map != null && !map.containsKey(contactProfile.f42434r)) {
                    map.put(contactProfile.f42434r, contactProfile);
                }
            }
        }
        return i11;
    }

    /* renamed from: Q */
    public ContactProfile m36630Q(int i11) {
        if (i11 >= 0 && i11 < mo10003k() && mo10005m(i11) == 0) {
            return (ContactProfile) this.f39451r.get(i11);
        }
        return null;
    }

    /* renamed from: R */
    public HashMap m36631R() {
        return this.f39454u;
    }

    /* renamed from: S */
    public int m36632S() {
        return this.f39454u.size();
    }

    /* renamed from: T */
    public boolean m36633T(int i11) {
        if (mo10005m(i11) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: U */
    public boolean m36634U() {
        return this.f39457x;
    }

    /* renamed from: V */
    public boolean m36635V(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return this.f39454u.containsKey(str);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: W */
    public void mo9990A(d dVar, int i11) {
        boolean z11;
        try {
            ContactProfile contactProfile = (ContactProfile) this.f39451r.get(i11);
            int mo10005m = mo10005m(i11);
            if (Build.VERSION.SDK_INT < 24 && this.f39452s) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f39452s = z11;
            dVar.mo36645i0(contactProfile, mo10005m, i11, z11);
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: X */
    public d mo9992C(ViewGroup viewGroup, int i11) {
        if (i11 == -1) {
            return new c(LayoutInflater.from(viewGroup.getContext()).inflate(AbstractC7409c0.item_description_header_delete_friend_phonebook, viewGroup, false), i11);
        }
        return new b(new DeletePhoneBookFriendModuleView(viewGroup.getContext(), this, this.f39453t));
    }

    /* renamed from: Y */
    public void m36638Y(Bundle bundle) {
        try {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("STATE_SELECTED_ITEMS_ID");
            if (stringArrayList != null && stringArrayList.size() > 0) {
                for (ContactProfile contactProfile : this.f39451r) {
                    if (contactProfile != null && !TextUtils.isEmpty(contactProfile.f42434r) && stringArrayList.contains(contactProfile.f42434r)) {
                        this.f39454u.put(contactProfile.f42434r, contactProfile);
                    }
                }
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: Z */
    public void m36639Z(Bundle bundle) {
        try {
            bundle.putStringArrayList("STATE_SELECTED_ITEMS_ID", new ArrayList<>(this.f39454u.keySet()));
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: a0 */
    public void m36640a0(List list) {
        if (list != null) {
            this.f39451r = list;
        } else {
            this.f39451r = new ArrayList();
        }
        m36627O();
    }

    /* renamed from: b0 */
    public void m36641b0(boolean z11) {
        this.f39457x = z11;
    }

    /* renamed from: c0 */
    public void m36642c0(boolean z11) {
        try {
            if (z11) {
                m36629P(this.f39454u);
            } else {
                this.f39454u.clear();
            }
            m10008p();
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    /* renamed from: d0 */
    public boolean m36643d0(int i11) {
        try {
            ContactProfile m36630Q = m36630Q(i11);
            if (m36630Q != null && !TextUtils.isEmpty(m36630Q.f42434r)) {
                if (this.f39454u.containsKey(m36630Q.f42434r)) {
                    this.f39454u.remove(m36630Q.f42434r);
                    AbstractC23647d.m123897g("5801167");
                } else {
                    this.f39454u.put(m36630Q.f42434r, m36630Q);
                    AbstractC23647d.m123897g("5801160");
                }
                this.f39457x = true;
                m10008p();
                return true;
            }
            return false;
        } catch (Exception e11) {
            e11.printStackTrace();
            return false;
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: k */
    public int mo10003k() {
        List list = this.f39451r;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.AbstractC1880g
    /* renamed from: m */
    public int mo10005m(int i11) {
        ContactProfile contactProfile = (ContactProfile) this.f39451r.get(i11);
        if (contactProfile != null && "-1".equals(contactProfile.f42434r)) {
            return -1;
        }
        return 0;
    }
}
