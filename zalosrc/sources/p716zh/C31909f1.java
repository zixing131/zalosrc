package p716zh;

import am.InterfaceC0949z;
import com.zing.zalo.data.entity.chat.message.MessageId;

/* renamed from: zh.f1 */
/* loaded from: classes3.dex */
public class C31909f1 {

    /* renamed from: a */
    public String f146609a;

    /* renamed from: b */
    public MessageId f146610b;

    public C31909f1(InterfaceC0949z interfaceC0949z) {
        try {
            this.f146609a = interfaceC0949z.getString(interfaceC0949z.getColumnIndex("chat_id"));
            MessageId m41038e = MessageId.m41038e(interfaceC0949z.getString(interfaceC0949z.getColumnIndex("last_deleted_msg_ts")), interfaceC0949z.getString(interfaceC0949z.getColumnIndex("last_deleted_msg_id")), this.f146609a, "");
            if (m41038e != null) {
                this.f146610b = m41038e;
            } else {
                this.f146610b = MessageId.m41039f();
            }
        } catch (Exception e11) {
            e11.printStackTrace();
        }
    }

    public C31909f1(String str, MessageId messageId) {
        this.f146609a = str;
        this.f146610b = messageId;
    }
}
