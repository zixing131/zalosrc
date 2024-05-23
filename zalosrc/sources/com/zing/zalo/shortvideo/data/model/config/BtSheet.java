package com.zing.zalo.shortvideo.data.model.config;

import fn0.AbstractC19060k;
import fn0.AbstractC19074t;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.InterfaceC21886d;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import pm0.C24848g0;
import qm0.AbstractC25361o0;
import qn0.InterfaceC25392g;
import tn0.AbstractC26805k1;
import tn0.C26788f;
import tn0.C26814n1;
import tn0.C26848z;
import un0.AbstractC27331i;

@InterfaceC25392g
/* loaded from: classes5.dex */
public final class BtSheet {
    public static final Companion Companion = new Companion(null);

    /* renamed from: b */
    private static final KSerializer[] f50102b = {new C26848z(C26814n1.f127034a, new C26788f(BottomSheetItem$$serializer.INSTANCE))};

    /* renamed from: a */
    private HashMap f50103a;

    /* loaded from: classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(AbstractC19060k abstractC19060k) {
            this();
        }

        /* renamed from: a */
        public final BtSheet m51422a(JsonObject jsonObject) {
            int m131400e;
            HashMap hashMap = new HashMap();
            if (jsonObject != null) {
                m131400e = AbstractC25361o0.m131400e(jsonObject.size());
                LinkedHashMap linkedHashMap = new LinkedHashMap(m131400e);
                Iterator<T> it = jsonObject.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    CharSequence charSequence = (CharSequence) entry.getKey();
                    if (charSequence != null && charSequence.length() != 0) {
                        JsonArray m139915l = AbstractC27331i.m139915l((JsonElement) entry.getValue());
                        if (!(m139915l instanceof JsonArray)) {
                            m139915l = null;
                        }
                        if (m139915l != null) {
                            ArrayList arrayList = new ArrayList();
                            Iterator<JsonElement> it2 = m139915l.iterator();
                            while (it2.hasNext()) {
                                BottomSheetItem m51416a = BottomSheetItem.Companion.m51416a(AbstractC27331i.m139916m(it2.next()));
                                if (m51416a == null || !m51416a.isValid()) {
                                    m51416a = null;
                                }
                                if (m51416a != null) {
                                    arrayList.add(m51416a);
                                }
                            }
                            if (!arrayList.isEmpty()) {
                                hashMap.put(entry.getKey(), arrayList);
                            }
                        }
                    }
                    linkedHashMap.put(C24848g0.f119245a, entry.getValue());
                }
            }
            if (hashMap.isEmpty()) {
                return null;
            }
            return new BtSheet(hashMap);
        }

        public final KSerializer serializer() {
            return BtSheet$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ BtSheet(int i11, HashMap hashMap, AbstractC26805k1 abstractC26805k1) {
        if ((i11 & 1) == 0) {
            this.f50103a = null;
        } else {
            this.f50103a = hashMap;
        }
    }

    /* renamed from: c */
    public static final /* synthetic */ void m51420c(BtSheet btSheet, InterfaceC21886d interfaceC21886d, SerialDescriptor serialDescriptor) {
        KSerializer[] kSerializerArr = f50102b;
        if (interfaceC21886d.mo114019A(serialDescriptor, 0) || btSheet.f50103a != null) {
            interfaceC21886d.mo114028h(serialDescriptor, 0, kSerializerArr[0], btSheet.f50103a);
        }
    }

    /* renamed from: b */
    public final HashMap m51421b() {
        return this.f50103a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof BtSheet) && AbstractC19074t.m100204b(this.f50103a, ((BtSheet) obj).f50103a);
    }

    public int hashCode() {
        HashMap hashMap = this.f50103a;
        if (hashMap == null) {
            return 0;
        }
        return hashMap.hashCode();
    }

    public String toString() {
        return "BtSheet(sheet=" + this.f50103a + ")";
    }

    public BtSheet(HashMap hashMap) {
        this.f50103a = hashMap;
    }
}
