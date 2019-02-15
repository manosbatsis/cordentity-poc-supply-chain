/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * SPDX-License-Identifier: Apache-2.0
 */

package com.luxoft.poc.supplychain.data.schema

import com.luxoft.poc.supplychain.data.schema.IndySchemaBuilder.AttrTypes
import com.luxoft.poc.supplychain.data.schema.IndySchemaBuilder.Attribute
import java.util.*

val name = "package_receipt-${Math.abs(Random().nextInt())}"
val version = "${Math.abs(Random().nextInt())}.${Math.abs(Random().nextInt())}.${Math.abs(Random().nextInt())}"

object PackageReceipt: IndySchema(name, version) {
    object Attributes {
        object Serial : AttrTypes by Attribute("serial")
    }

    override fun getSchemaAttrs(): List<AttrTypes> = listOf(Attributes.Serial)
}
