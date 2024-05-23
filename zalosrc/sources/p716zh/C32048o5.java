package p716zh;

import com.zing.zalo.control.InviteContactProfile;
import com.zing.zalo.zvideoutil.ZVideoUtilMetadata;
import com.zing.zalocore.connection.socket.AbstractC17522a;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import me0.AbstractC23238v2;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: zh.o5 */
/* loaded from: classes3.dex */
public class C32048o5 {

    /* renamed from: a */
    public int f147571a;

    /* renamed from: b */
    public Object f147572b;

    public C32048o5(int i11, Object obj) {
        this.f147571a = i11;
        this.f147572b = obj;
    }

    /* renamed from: a */
    public static void m154643a(ByteArrayOutputStream byteArrayOutputStream, int i11, Object obj) {
        JSONObject jSONObject;
        if (byteArrayOutputStream != null) {
            try {
                byteArrayOutputStream.write(i11);
                switch (i11) {
                    case 0:
                        AbstractC23238v2.m119728m(byteArrayOutputStream, (String) obj);
                        return;
                    case 1:
                        AbstractC23238v2.m119728m(byteArrayOutputStream, (String) obj);
                        return;
                    case 2:
                        ArrayList arrayList = (ArrayList) obj;
                        JSONObject jSONObject2 = new JSONObject();
                        JSONArray jSONArray = new JSONArray();
                        if (arrayList != null) {
                            Iterator it = arrayList.iterator();
                            while (it.hasNext()) {
                                InviteContactProfile inviteContactProfile = (InviteContactProfile) it.next();
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("uid", inviteContactProfile.f42434r);
                                jSONObject3.put("src", inviteContactProfile.f42373R0);
                                jSONArray.put(jSONObject3);
                            }
                        }
                        jSONObject2.put("members", jSONArray);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject2.toString());
                        return;
                    case 3:
                        byteArrayOutputStream.write(((Integer) obj).intValue());
                        return;
                    case 4:
                        JSONObject jSONObject4 = new JSONObject();
                        jSONObject4.put("suggestId", obj);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject4.toString());
                        return;
                    case 5:
                        byteArrayOutputStream.write(((Integer) obj).intValue());
                        return;
                    case 6:
                        byteArrayOutputStream.write(((Integer) obj).intValue());
                        return;
                    case 7:
                        byteArrayOutputStream.write(((Integer) obj).intValue());
                        return;
                    case 8:
                        byteArrayOutputStream.write(AbstractC17522a.m93345h(((Short) obj).shortValue()));
                        return;
                    case 9:
                        ArrayList arrayList2 = (ArrayList) obj;
                        JSONObject jSONObject5 = new JSONObject();
                        JSONArray jSONArray2 = new JSONArray();
                        if (arrayList2 != null) {
                            Iterator it2 = arrayList2.iterator();
                            while (it2.hasNext()) {
                                jSONArray2.put((Integer) it2.next());
                            }
                        }
                        jSONObject5.put("cateIds", jSONArray2);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject5.toString());
                        return;
                    case 10:
                        JSONObject jSONObject6 = new JSONObject();
                        jSONObject6.put("hashtag", obj);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject6.toString());
                        return;
                    case 11:
                        C31868c5 c31868c5 = (C31868c5) obj;
                        JSONObject jSONObject7 = new JSONObject();
                        JSONObject jSONObject8 = new JSONObject();
                        jSONObject8.put("lon", c31868c5.m153170b());
                        jSONObject8.put("lat", c31868c5.m153169a());
                        jSONObject7.put(ZVideoUtilMetadata.ZMETADATA_KEY_LOCATION, jSONObject8);
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject7.toString());
                        return;
                    case 12:
                        JSONArray jSONArray3 = new JSONArray();
                        Iterator it3 = ((ArrayList) obj).iterator();
                        while (it3.hasNext()) {
                            String str = (String) it3.next();
                            JSONObject jSONObject9 = new JSONObject();
                            jSONObject9.put("phone", str);
                            jSONArray3.put(jSONObject9);
                        }
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONArray3.toString());
                        return;
                    case 13:
                        try {
                            jSONObject = new JSONObject((String) obj);
                        } catch (Exception e11) {
                            JSONObject jSONObject10 = new JSONObject();
                            e11.printStackTrace();
                            jSONObject = jSONObject10;
                        }
                        AbstractC23238v2.m119728m(byteArrayOutputStream, jSONObject.toString());
                        return;
                    default:
                        return;
                }
            } catch (Exception e12) {
                e12.printStackTrace();
            }
            e12.printStackTrace();
        }
    }

    /* renamed from: b */
    public static void m154644b(ByteArrayOutputStream byteArrayOutputStream, ArrayList arrayList) {
        if (byteArrayOutputStream != null) {
            if (arrayList != null) {
                byteArrayOutputStream.write(arrayList.size());
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    C32048o5 c32048o5 = (C32048o5) it.next();
                    m154643a(byteArrayOutputStream, c32048o5.f147571a, c32048o5.f147572b);
                }
                return;
            }
            byteArrayOutputStream.write(0);
        }
    }
}
