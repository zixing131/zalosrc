package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import p031b5.AbstractC2552a;

/* loaded from: classes2.dex */
public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator<AccountChangeEventsRequest> CREATOR = new C4050c();

    /* renamed from: p */
    private final int f15902p;

    /* renamed from: q */
    private int f15903q;

    /* renamed from: r */
    private String f15904r;

    /* renamed from: s */
    private Account f15905s;

    /* JADX INFO: Access modifiers changed from: package-private */
    public AccountChangeEventsRequest(int i11, int i12, String str, Account account) {
        this.f15902p = i11;
        this.f15903q = i12;
        this.f15904r = str;
        if (account == null && !TextUtils.isEmpty(str)) {
            this.f15905s = new Account(str, "com.google");
        } else {
            this.f15905s = account;
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i11) {
        int m12912a = AbstractC2552a.m12912a(parcel);
        AbstractC2552a.m12924m(parcel, 1, this.f15902p);
        AbstractC2552a.m12924m(parcel, 2, this.f15903q);
        AbstractC2552a.m12934w(parcel, 3, this.f15904r, false);
        AbstractC2552a.m12932u(parcel, 4, this.f15905s, i11, false);
        AbstractC2552a.m12913b(parcel, m12912a);
    }
}
