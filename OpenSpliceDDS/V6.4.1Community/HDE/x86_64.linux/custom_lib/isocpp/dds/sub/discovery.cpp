/*
*                         OpenSplice DDS
*
*   This software and documentation are Copyright 2006 to 2012 PrismTech
*   Limited and its licensees. All rights reserved. See file:
*
*                     $OSPL_HOME/LICENSE
*
*   for full copyright notice and license terms.
*
*/


/**
 * @file
 */

#include <dds/sub/discovery.hpp>

namespace dds
{
namespace sub
{

void ignore(const dds::domain::DomainParticipant& dp,
            const dds::core::InstanceHandle& handle)
{
    DDS::ReturnCode_t result = ((dds::domain::DomainParticipant)dp)->dp_->ignore_publication(handle->handle());
    org::opensplice::core::check_and_throw(result, OSPL_CONTEXT_LITERAL("Calling ::ignore_publication"));
}

}
}